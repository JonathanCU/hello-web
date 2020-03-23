package com.example.helloweb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.helloweb.model.entity.Empleado;
import com.example.helloweb.repository.EmpleadoRepository;

import lombok.AllArgsConstructor;

/**
 * @author Jonathan
 *
 */
@AllArgsConstructor
@Component
public class HelloWebRunner implements CommandLineRunner{
	private EmpleadoRepository empleadoRepository;

	@Override
	public void run(String... args) throws Exception {
		List<Empleado> empleados = new ArrayList<>();
		empleados.add(new Empleado(1l, "Jonathan", "5568812020", "jonathan.cu95@gmail.com", new Date(), "Masculino"));
		empleados.add(new Empleado(2l, "Javier", "5568812021", "javierdels95@gmail.com", new Date(), "Masculino"));
		empleadoRepository.saveAll(empleados);
	}

}
