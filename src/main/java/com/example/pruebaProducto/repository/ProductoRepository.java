package com.example.pruebaProducto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pruebaProducto.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
