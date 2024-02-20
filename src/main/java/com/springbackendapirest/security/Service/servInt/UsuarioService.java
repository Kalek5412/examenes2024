package com.springbackendapirest.security.Service.servInt;


import com.springbackendapirest.security.entidades.Usuario;
import com.springbackendapirest.security.entidades.UsuarioRol;

import java.util.Set;

public interface UsuarioService {
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws  Exception;
    public Usuario obtenerUsuario(String username);
    public void eliminarUsuario(Long usuarioId);
}
