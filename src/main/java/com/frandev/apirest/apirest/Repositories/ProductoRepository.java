package com.frandev.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frandev.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
