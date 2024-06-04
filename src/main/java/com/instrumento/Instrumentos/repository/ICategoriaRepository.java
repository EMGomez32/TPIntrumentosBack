package com.instrumento.Instrumentos.repository;

import com.instrumento.Instrumentos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Long> {
    Categoria findByCodigo(long codigo);
}
