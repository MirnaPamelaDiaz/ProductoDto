package com.producto.dto.dto.requestDto;

import lombok.Data;

@Data
public class ProductoRequestDto {

    private String nombre;

    private Integer cantidad;

    private Double precio;

    private String descripcion;

    private CategoriaRequestDto categoriaRequestDto;
}
