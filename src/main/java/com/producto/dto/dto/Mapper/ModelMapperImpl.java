package com.producto.dto.dto.Mapper;

import com.producto.dto.dto.requestDto.CategoriaRequestDto;
import com.producto.dto.dto.requestDto.ProductoRequestDto;
import com.producto.dto.dto.responseDto.CategoriaResponseDto;
import com.producto.dto.dto.responseDto.ProductoResponseDto;
import com.producto.dto.entity.Categoria;
import com.producto.dto.entity.Producto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperImpl implements ModelMapperInterface{
    private ModelMapper mm;


    @Override
    public Producto productoReqDtoAProducto(ProductoRequestDto productoRequestDto) {
        return mm.map(productoRequestDto,Producto.class);
    }

    @Override
    public ProductoResponseDto productoAProductoResDto(Producto producto) {
       return mm.map(producto,ProductoResponseDto.class);
    }

    @Override
    public Categoria categoriaReqDtoACategoria(CategoriaRequestDto categoriaRequestDto) {
        return mm.map(categoriaRequestDto,Categoria.class);
    }

    @Override
    public CategoriaResponseDto categoriACategoriaResDtoa(Categoria categoria) {
        return mm.map(categoria,CategoriaResponseDto.class);
    }
}
