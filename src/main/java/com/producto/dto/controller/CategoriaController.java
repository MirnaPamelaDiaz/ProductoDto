package com.producto.dto.controller;

import com.producto.dto.entity.Categoria;
import com.producto.dto.service.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> verCategoria(@PathVariable("id")Integer id){
        return categoriaService.verCategoria(id);
    }
    @PostMapping("/")
    public ResponseEntity<String> crearCategoria(@RequestBody Categoria categoria){
        return categoriaService.crearCategoria(categoria);
    }
}
