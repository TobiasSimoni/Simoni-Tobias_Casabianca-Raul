package com.backend.parcial.dao;

import com.backend.parcial.model.Odontologos;

import java.util.List;

public interface IDao<T> {
    List<Odontologos> Listarodontologos(T t);
    T GuardarOdontologo(T t);


}
