package com.producto.dto.dto.responseDto;

import lombok.Data;

@Data
public class ProductoResponseDto {

    private Integer id;

    private  String nombre;

    private Integer cantidad;

    private Double precio;

    private String descripcion;

    private CategoriaResponseDto categoriaResponseDto;
}
