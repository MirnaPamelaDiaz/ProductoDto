package com.producto.dto.controller;

import com.producto.dto.entity.Producto;
import com.producto.dto.service.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/productos")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping("/{id}")
    public ResponseEntity<Producto> verProducto(@PathVariable("id")Integer id){
        return productoService.verProducto(id);
    }
    @PostMapping("/")
    public ResponseEntity<String> crearProducto(@RequestBody Producto producto){
        return productoService.crearProducto(producto);
    }
}
