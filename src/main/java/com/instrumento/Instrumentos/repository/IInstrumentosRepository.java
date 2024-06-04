package com.instrumento.Instrumentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.instrumento.Instrumentos.model.Instrumentos;
@Repository
public interface IInstrumentosRepository extends JpaRepository <Instrumentos,Long> {

    Instrumentos findById(long id);
}
