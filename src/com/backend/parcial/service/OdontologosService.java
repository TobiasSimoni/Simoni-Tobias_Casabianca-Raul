package com.backend.parcial.service;

import com.backend.parcial.dao.IDao;
import com.backend.parcial.model.Odontologos;

import java.util.List;

public class OdontologosService {
private IDao<Odontologos> odontologosIDao;
public  OdontologosService(IDao<Odontologos> odontologosIDao){
    this.odontologosIDao = odontologosIDao;
}
public Odontologos GuardarOdontologo(Odontologos odontologo){
    return  odontologosIDao.GuardarOdontologo(odontologo);
}


}