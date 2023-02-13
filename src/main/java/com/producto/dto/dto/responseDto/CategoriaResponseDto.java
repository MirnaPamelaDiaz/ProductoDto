package com.producto.dto.dto.responseDto;

import com.producto.dto.dto.requestDto.ProductoRequestDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class CategoriaResponseDto {

    private String nombre;

    private List<ProductoRequestDto> listaProductos = new ArrayList();
}
