package com.producto.dto.controller;

import com.producto.dto.dto.requestDto.ProductoRequestDto;
import com.producto.dto.dto.responseDto.ProductoResponseDto;
import com.producto.dto.service.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductoResponseDto> verProducto(@PathVariable("id") Integer id) {
        return productoService.verProducto(id);
    }

    @PostMapping("/")
    public ResponseEntity<String> crearProducto(@RequestBody ProductoRequestDto productoRequestDto) {
        return productoService.crearProducto(productoRequestDto);
    }
}
