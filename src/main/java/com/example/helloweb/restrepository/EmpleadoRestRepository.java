package com.example.helloweb.restrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.helloweb.model.entity.Empleado;

@RepositoryRestResource(collectionResourceRel = "empleado", path = "empleado")
public interface EmpleadoRestRepository extends JpaRepository<Empleado, Long>{
	
	List<Empleado> getByNombre(@Param("nombre") String nombre);
	
}
