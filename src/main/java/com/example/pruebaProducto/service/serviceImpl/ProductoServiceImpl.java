package com.example.pruebaProducto.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pruebaProducto.model.Producto;
import com.example.pruebaProducto.repository.ProductoRepository;
import com.example.pruebaProducto.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	@Override
	public List<Producto> findAllProducto() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	@Override
	public Producto save(Producto model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto update(Producto model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
