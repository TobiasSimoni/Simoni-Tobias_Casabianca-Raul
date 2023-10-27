package com.backend.parcial.model;

import java.util.List;

public class Odontologos  {
    private int id;
    private int Numeromatricula;
    private String Nombre;

    private String apellido;

    public Odontologos(int numerodematricula, String nombre, String apellido) {
        Numeromatricula = numerodematricula;
        Nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologos(int id, int numerodematricula, String nombre, String apellido) {
        this.id = id;
        Numeromatricula = numerodematricula;
        Nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumerodematricula() {
        return Numeromatricula;
    }

    public void setNumerodematricula(int numerodematricula) {
        Numeromatricula = numerodematricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Odontologo{" +
                "id=" + id +
                ", Numerodematricula=" + Numeromatricula +
                ", Nombre='" + Nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
