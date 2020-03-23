package com.example.helloweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.helloweb.model.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
	
}
