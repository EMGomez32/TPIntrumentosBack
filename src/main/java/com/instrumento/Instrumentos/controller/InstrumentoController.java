package com.instrumento.Instrumentos.controller;

import com.instrumento.Instrumentos.model.Instrumentos;
import com.instrumento.Instrumentos.repository.IInstrumentosRepository;
import com.instrumento.Instrumentos.services.InstrumentosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/instrumentos")
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
    @Autowired
    private InstrumentosServices instrumentosServices;
    @GetMapping("/buscar/{id}")
    public Instrumentos getInstrumentos(@PathVariable long id){
        return instrumentosServices.obtenerInstrumento(id);
    }


}
