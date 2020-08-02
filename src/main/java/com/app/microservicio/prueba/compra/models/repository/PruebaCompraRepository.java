package com.app.microservicio.prueba.compra.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.commons.prueba.compra.models.entity.PruebaCompra;

@Repository
public interface PruebaCompraRepository  extends CrudRepository<PruebaCompra,Long>  {

}
