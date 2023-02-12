package com.producto.dto.repository;

import com.producto.dto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {
    @Query (value = "SELECT p.* FROM producto p WHERE p.id = ?1", nativeQuery = true)
    Producto traer(Integer id);
}
