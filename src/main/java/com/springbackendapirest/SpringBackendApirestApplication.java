package com.springbackendapirest;

import com.springbackendapirest.security.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringBackendApirestApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApirestApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

//		Usuario usuario = new Usuario();
//		usuario.setNombre("Alejandro");
//		usuario.setApellido("Lujan");
//		usuario.setUsername("kalek");
//		usuario.setPassword("123456");
//		usuario.setEmail("kalek@gmail.com");
//		usuario.setTelefono("943000000");
//		usuario.setPerfil("foto.png");
//
//		Rol rol = new Rol();
//		rol.setId(1L);
//		rol.setNombre("ADMIN");
//
//		Set<UsuarioRol> usuarioRoles = new HashSet<>();
//		UsuarioRol usuarioRol = new UsuarioRol();
//		usuarioRol.setRol(rol);
//		usuarioRol.setUsuario(usuario);
//		usuarioRoles.add(usuarioRol);
//
//		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuarioRoles);
//		System.out.println(usuarioGuardado.getUsername());
	}
}
