package com.project.project1.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;
    @Column(name = "id_cliente")
    private Integer idCliente;
    private LocalDateTime fecha;
    private String medioPago;
    private String comentario;
    private Boolean estado;
    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productoList;

    @ManyToOne
    @JoinColumn(name = "id_cliente",insertable = false, updatable = false)
    private Cliente cliente;

}
