package com.backend.parcial.model;

public class Odontologo {
    private int id;
    private int Numerodematricula;
    private String Nombre;

    private String apellido;

    public Odontologo(int numerodematricula, String nombre, String apellido) {
        Numerodematricula = numerodematricula;
        Nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologo(int id, int numerodematricula, String nombre, String apellido) {
        this.id = id;
        Numerodematricula = numerodematricula;
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
        return Numerodematricula;
    }

    public void setNumerodematricula(int numerodematricula) {
        Numerodematricula = numerodematricula;
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
                ", Numerodematricula=" + Numerodematricula +
                ", Nombre='" + Nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
