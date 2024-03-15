package io.girhub.curso.sbootexpsecurity.domain.repository;

import io.girhub.curso.sbootexpsecurity.domain.entity.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrupoRepository extends JpaRepository<Grupo, String> {
}
