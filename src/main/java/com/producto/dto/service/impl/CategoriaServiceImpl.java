package com.producto.dto.service.impl;

import com.producto.dto.entity.Categoria;
import com.producto.dto.repository.CategoriaRepository;
import com.producto.dto.service.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    CategoriaRepository repository;

    @Override
    public ResponseEntity<Categoria> listarCategorias() {
        return null;
    }

    @Override
    public ResponseEntity<Categoria> verCategoria(Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findById(id).get());
    }

    @Override
    public ResponseEntity<String> crearCategoria(Categoria categoria) {
        repository.save(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body("categoria creada");
    }

    @Override
    public ResponseEntity<String> modificarCategoria(Categoria categoria, Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<String> eliminarCategoria(Integer id) {
        return null;
    }
}
