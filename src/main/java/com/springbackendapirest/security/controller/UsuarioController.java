package com.springbackendapirest.security.controller;

import com.springbackendapirest.security.Service.servInt.UsuarioService;
import com.springbackendapirest.security.entidades.Rol;
import com.springbackendapirest.security.entidades.Usuario;
import com.springbackendapirest.security.entidades.UsuarioRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception{
        usuario.setPerfil("default.png");
        Set<UsuarioRol> usuarioRoles = asignarRolNormal(usuario);
        return usuarioService.guardarUsuario(usuario,usuarioRoles);
    }


    @GetMapping("/{username}")
    public ResponseEntity<?> obtenerUsuario(@PathVariable("username") String username){
        Usuario userNombre = usuarioService.obtenerUsuario(username);
        if (userNombre != null) {
            return new ResponseEntity<>(userNombre, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{usuarioId}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable("usuarioId") Long usuarioId){
        usuarioService.eliminarUsuario(usuarioId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private Set<UsuarioRol> asignarRolNormal(Usuario usuario) {
        Set<UsuarioRol> usuarioRoles = new HashSet<>();
        Rol rol = new Rol();
        rol.setId(2L);
        rol.setNombre("NORMAL");
        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);
        usuarioRoles.add(usuarioRol);
        return usuarioRoles;
    }
}
