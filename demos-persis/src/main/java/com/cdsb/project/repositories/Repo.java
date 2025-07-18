package com.cdsb.project.repositories;

import java.util.List;


public interface Repo<E, I> {
//E(T) Datos de la entidad
//I tipo de identidad
//DTO tipo de dato

    List<E> readAll();
    //findAll
    //getAll
    
    E readById(I id) throws Exception;//Coge los datos si no lo encuentra lanza una excepción
    //findById
    //getById
    E create(E data) throws Exception;
    //save
    E updateById (E data) throws Exception;//
    //update
    E deleteById(I id) throws Exception;//Si no puede eliminar lanza una excepción
    //delete
}
