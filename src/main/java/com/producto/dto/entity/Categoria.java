package com.producto.dto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categoria")
@SQLDelete(sql = "UPDATE categoria SET alta=false WHERE id = ?")
@Where(clause = "alta = true")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "id_categoria")
    private Integer id;

    private String nombre;

    private Boolean alta = true;

   @OneToMany(mappedBy = "categoria")
    private List<Producto> listaProductos = new ArrayList();
}