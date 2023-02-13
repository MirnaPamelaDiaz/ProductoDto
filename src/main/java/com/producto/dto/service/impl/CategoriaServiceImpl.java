package com.producto.dto.service.impl;

import com.producto.dto.dto.Mapper.ModelMapperInterface;
import com.producto.dto.dto.requestDto.CategoriaRequestDto;
import com.producto.dto.dto.responseDto.CategoriaResponseDto;
import com.producto.dto.entity.Categoria;
import com.producto.dto.repository.CategoriaRepository;
import com.producto.dto.service.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private ModelMapperInterface mm;
    @Autowired
    CategoriaRepository repository;

    @Override
    public ResponseEntity<CategoriaResponseDto> verCategoria(Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(mm.categoriACategoriaResDtoa(repository.findById(id).get()));
    }

    @Override
    public ResponseEntity<String> crearCategoria(CategoriaRequestDto categoriaRequestDto) {
        repository.save(mm.categoriaReqDtoACategoria(categoriaRequestDto));
        return ResponseEntity.status(HttpStatus.CREATED).body("categoria creada");
    }

}
