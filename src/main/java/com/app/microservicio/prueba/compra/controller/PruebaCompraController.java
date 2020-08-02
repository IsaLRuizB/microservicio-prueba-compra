package com.app.microservicio.prueba.compra.controller;

import org.springframework.web.bind.annotation.RestController;

import com.app.commons.prueba.compra.models.entity.PruebaCompra;
import com.app.microservicio.prueba.compra.service.PruebaCompraService;
import com.common.microservicios.controller.CommonController;

@RestController
public class PruebaCompraController extends CommonController<PruebaCompra, PruebaCompraService> {

}
