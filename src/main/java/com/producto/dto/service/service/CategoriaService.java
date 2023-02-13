package com.producto.dto.service.service;

import com.producto.dto.dto.requestDto.CategoriaRequestDto;
import com.producto.dto.dto.responseDto.CategoriaResponseDto;
import com.producto.dto.entity.Categoria;
import org.springframework.http.ResponseEntity;

public interface CategoriaService {

    ResponseEntity<CategoriaResponseDto> verCategoria(Integer id);
    ResponseEntity<String> crearCategoria(CategoriaRequestDto categoriaRequestDto);

}
