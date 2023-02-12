package com.producto.dto.service.impl;

import com.producto.dto.entity.Categoria;
import com.producto.dto.entity.Producto;
import com.producto.dto.repository.CategoriaRepository;
import com.producto.dto.repository.ProductoRepository;
import com.producto.dto.service.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository repository;
    @Autowired
    CategoriaRepository categoriaService;

    @Override
    public ResponseEntity<Producto> listarProductos() {
        return null;
    }

    @Override
    public ResponseEntity<Producto> verProducto(Integer id) {
        Producto producto = repository.traer(id);
        return ResponseEntity.status(HttpStatus.OK).body(producto);
    }

    @Override
    public ResponseEntity<String> crearProducto(Producto producto) {
        Categoria categoria = categoriaService.save(producto.getCategoria());
        producto.setCategoria(categoria);
        repository.save(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body("producto creado");
    }

    @Override
    public ResponseEntity<String> modificarProducto(Producto producto, Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<String> eliminarProducto(Integer id) {
        return null;
    }
}
