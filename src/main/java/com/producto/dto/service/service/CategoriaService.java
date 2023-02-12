package com.producto.dto.service.service;

import com.producto.dto.entity.Categoria;
import org.springframework.http.ResponseEntity;

public interface CategoriaService {

    ResponseEntity<Categoria> listarCategorias();
    ResponseEntity<Categoria> verCategoria(Integer id);
    ResponseEntity<String> crearCategoria(Categoria categoria);
    ResponseEntity<String> modificarCategoria(Categoria categoria ,Integer id);
    ResponseEntity<String> eliminarCategoria(Integer id);
}
