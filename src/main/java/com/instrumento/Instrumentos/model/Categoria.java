package com.instrumento.Instrumentos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Categoria extends EntityId {
    private String denominacion;
    @Column(unique = true)
    private long codigo;
}
