package com.springbackendapirest.repository;

import com.springbackendapirest.entidades.Examen;
import com.springbackendapirest.entidades.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface PreguntaRepository extends JpaRepository<Pregunta,Long> {
    Set<Pregunta> findByExamen(Examen examen);
}
