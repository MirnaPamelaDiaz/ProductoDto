package com.producto.dto.dto.Mapper;

import com.producto.dto.dto.requestDto.CategoriaRequestDto;
import com.producto.dto.dto.requestDto.ProductoRequestDto;
import com.producto.dto.dto.responseDto.CategoriaResponseDto;
import com.producto.dto.dto.responseDto.ProductoResponseDto;
import com.producto.dto.entity.Categoria;
import com.producto.dto.entity.Producto;


public interface ModelMapperInterface {
    //PRODUCTO
    Producto productoReqDtoAProducto(ProductoRequestDto productoRequestDto);

    ProductoResponseDto productoAProductoResDto(Producto producto);


    //CATEGORIA
    Categoria categoriaReqDtoACategoria(CategoriaRequestDto categoriaRequestDto);

    CategoriaResponseDto categoriACategoriaResDtoa(Categoria categoria);

}
