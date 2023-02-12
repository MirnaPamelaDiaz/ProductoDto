package com.producto.dto.service.service;

import com.producto.dto.entity.Producto;
import org.springframework.http.ResponseEntity;

public interface ProductoService {

    ResponseEntity<Producto> listarProductos();

    ResponseEntity<Producto> verProducto(Integer id);

    ResponseEntity<String> crearProducto(Producto producto);

    ResponseEntity<String> modificarProducto(Producto producto, Integer id);

    ResponseEntity<String> eliminarProducto(Integer id);
}
