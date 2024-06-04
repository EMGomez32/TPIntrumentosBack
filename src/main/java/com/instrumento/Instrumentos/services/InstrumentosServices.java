package com.instrumento.Instrumentos.services;

import com.instrumento.Instrumentos.repository.IInstrumentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstrumentosServices {

    @Autowired
    private IInstrumentosRepository isntrumentosRepository;



}
