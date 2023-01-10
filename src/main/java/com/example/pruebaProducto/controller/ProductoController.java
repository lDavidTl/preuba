package com.example.pruebaProducto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pruebaProducto.service.ProductoService;
import com.example.pruebaProducto.model.Producto;

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Producto>> getAllTutorials(@RequestParam(required = false) String title) {
		try {
			return new ResponseEntity<>(productoService.findAllProducto(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
