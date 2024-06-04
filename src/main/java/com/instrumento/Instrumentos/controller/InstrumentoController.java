package com.instrumento.Instrumentos.controller;

import com.instrumento.Instrumentos.model.Instrumentos;
import com.instrumento.Instrumentos.repository.IInstrumentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/Instrumentos")
public class InstrumentoController {

    @Autowired
    private IInstrumentosRepository iInstrumentosRepository;


    @PostMapping
    public List<Instrumentos> saveInstrumento(@RequestBody List<Instrumentos> instrumentos){

        return iInstrumentosRepository.saveAll(instrumentos);

    }
    @GetMapping
    public List<Instrumentos> getAllInstrumentos(){
        return iInstrumentosRepository.findAll();
    }


}
