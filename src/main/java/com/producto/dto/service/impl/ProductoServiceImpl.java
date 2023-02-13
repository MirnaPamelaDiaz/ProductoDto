package com.producto.dto.service.impl;

import com.producto.dto.dto.Mapper.ModelMapperInterface;
import com.producto.dto.dto.requestDto.ProductoRequestDto;
import com.producto.dto.dto.responseDto.ProductoResponseDto;
import com.producto.dto.entity.Categoria;
import com.producto.dto.entity.Producto;
import com.producto.dto.repository.CategoriaRepository;
import com.producto.dto.repository.ProductoRepository;
import com.producto.dto.service.service.CategoriaService;
import com.producto.dto.service.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository repository;
    @Autowired
    CategoriaRepository categoriaRepository;
    @Autowired
    private ModelMapperInterface mm;

    @Autowired
    CategoriaService categoriaService;

    @Override
    public ResponseEntity<ProductoResponseDto> verProducto(Integer id) {
        Producto producto = repository.traer(id);
        return ResponseEntity.status(HttpStatus.OK).body(mm.productoAProductoResDto(producto));
    }

    @Override
    public ResponseEntity<String> crearProducto(ProductoRequestDto productoRequestDto) {
       /*
        Categoria categoria = categoriaRepository.save(producto.getCategoria());
        producto.setCategoria(categoria);
        repository.save(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body("producto creado");*/
        return null;
    }

}
