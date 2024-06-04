package com.instrumento.Instrumentos.services;

import com.instrumento.Instrumentos.model.Instrumentos;
import com.instrumento.Instrumentos.repository.IInstrumentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentosServices {

    @Autowired
    private IInstrumentosRepository instrumentosRepository;

    public Instrumentos obtenerInstrumento(long id){
        return instrumentosRepository.findById(id);
    }

}
