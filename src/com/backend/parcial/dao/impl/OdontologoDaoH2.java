package com.backend.parcial.dao.impl;

import com.backend.parcial.dao.IDao;
import com.backend.parcial.dao.h2Connection;
import com.backend.parcial.model.Odontologos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class OdontologoDaoH2 implements IDao<Odontologos> {

     private final Logger LOGGER = Logger.getLogger(OdontologoDaoH2.class);

        @Override

        public Odontologos GuardarOdontologo(Odontologos odontologo) {

        Connection  connection = null;
        Odontologos odontologoRegistrado = null;

        try {
            connection = h2Connection.getConnection();
            connection.setAutoCommit(false);

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO ODONTOLOGOS (NUMEROMATRICULA,NOMBRE,APELLIDO) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setInt(1,odontologo.getNumerodematricula());
            preparedStatement.setString(2,odontologo.getNombre());
            preparedStatement.setString(3,odontologo.getApellido());
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            odontologoRegistrado = new Odontologos(odontologo.getNumerodematricula(),odontologo.getNombre(),odontologo.getApellido());

            while (resultSet.next()){
                odontologoRegistrado.setId(resultSet.getInt("id"));
            }
            connection.commit();
            LOGGER.info("Se ha Registrado el Odontologo: " + odontologoRegistrado);



        }

        catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            if (connection != null) {
                try {
                    connection.rollback();
                    LOGGER.info("Tuvimos un problema");
                    LOGGER.error(e.getMessage());
                    e.printStackTrace();
                } catch (SQLException exception) {
                    LOGGER.error(exception.getMessage());
                    exception.printStackTrace();
                }
            }
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                LOGGER.error("No se pudo cerrar la conexion: " + ex.getMessage());
            }
        }


        return odontologoRegistrado;
    }




    @Override
    public List<Odontologos> Listarodontologos(Odontologos odontologo) {

        Connection  connection = null;
        List<Odontologos> odontologos= new ArrayList<>();


        try{
       connection =  h2Connection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM ODONTOLOGOS");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                 odontologos = GuardarOdontologo(resultSet);
                odontologos.add(odontologo);
            }
              LOGGER.info("Listado de Odontologos Obtenidos: " + odontologos);


      }

        catch (Exception e) {
         LOGGER.error(e.getMessage());
          e.printStackTrace();

        }

        finally {

            try {
        connection.close();
    }

            catch (Exception ex) {
        LOGGER.error("No se pudo cerrar la conexion: " + ex.getMessage());
    }
     }












        return odontologos;
    }

     private  Odontologos crearobjetoodontologo(ResultSet resultSet) throws SQLException {
      return  new Odontologos(resultSet.getInt("id"),resultSet.getInt("Numeromatricula"),resultSet.getString("nombre"),resultSet.getString("apellido"));
     }

    }



