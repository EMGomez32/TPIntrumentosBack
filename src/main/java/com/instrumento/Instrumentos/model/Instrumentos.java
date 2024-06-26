package com.instrumento.Instrumentos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Instrumentos extends EntityId{

    @Column(length = 2000)
    private String instrumento;

    private String marca ;
    private String modelo;

    @Column(length = 10000)
    private String imagen;
    private double precio;
    private String costoEnvio;
    private long cantidadVendida;
    @Column(length = 2000)
    private String descripcion;




}
