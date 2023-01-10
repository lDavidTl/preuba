package com.example.pruebaProducto.service;

import java.util.List;

import com.example.pruebaProducto.model.Producto;

public interface ProductoService {
	
	public List<Producto> findAllProducto();
	
	public Producto save(Producto model);
	
	public Producto update(Producto model);
	
	public String delete(Long id);
}
