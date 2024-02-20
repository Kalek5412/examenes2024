package com.springbackendapirest.security.repository;

import com.springbackendapirest.security.entidades.Rol;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RolRepository extends JpaRepository<Rol,Long> {
}
