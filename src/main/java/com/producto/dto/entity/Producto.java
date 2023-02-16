package com.producto.dto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "producto")
@SQLDelete(sql = "UPDATE producto SET alta=false WHERE id = ?")
@Where(clause = "alta = true")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //TODO ver si el @Column(name = "id_producto") afecta a la relacion en la BBD
    // @Column(name = "id_producto")
    private Integer id;

    private String nombre;

    private Integer cantidad;

    private Double precio;

    private String descripcion;

    private Boolean alta = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria")
    private Categoria categoria;
}
