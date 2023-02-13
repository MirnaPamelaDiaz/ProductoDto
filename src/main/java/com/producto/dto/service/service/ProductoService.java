package com.producto.dto.service.service;

import com.producto.dto.dto.requestDto.ProductoRequestDto;
import com.producto.dto.dto.responseDto.ProductoResponseDto;
import com.producto.dto.entity.Producto;
import org.springframework.http.ResponseEntity;

public interface ProductoService {

    ResponseEntity<ProductoResponseDto> verProducto(Integer id);

    ResponseEntity<String> crearProducto(ProductoRequestDto productoRequestDto);

}
