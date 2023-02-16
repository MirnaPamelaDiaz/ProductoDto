package com.producto.dto.repository;

import com.producto.dto.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    @Query(value = "SELECT * FROM categoria WHERE nombre =:nombre", nativeQuery = true)
    Categoria findByNombre(String nombre);

}
