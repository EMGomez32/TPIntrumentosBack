package com.instrumento.Instrumentos.controller;

import com.instrumento.Instrumentos.model.Categoria;
import com.instrumento.Instrumentos.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/mostrarLista")
    public List<Categoria> getListaCategoria(){
        return categoriaService.getListaCategoria();

    }

    @GetMapping("/buscar/{id}")
    public Categoria getBuscarCategoriaXId(@PathVariable long id){
        return categoriaService.obtenerCategoria(id);
    }

    @GetMapping("/buscar/{codigo}")
    public Categoria getBuscarCategoriaXCodigo(@PathVariable long codigo){
        return categoriaService.obtenerCategoria(codigo);
    }
    @PostMapping("/cargar")
    public Categoria cargarCategoria(Categoria categoria){
        return categoriaService.cargarCategoria(categoria);
    }

}
