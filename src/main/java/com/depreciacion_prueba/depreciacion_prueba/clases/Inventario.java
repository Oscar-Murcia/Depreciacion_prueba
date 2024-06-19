package com.depreciacion_prueba.depreciacion_prueba.clases;

import io.swagger.models.auth.In;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "inventario")

public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Nro_serial;
    private String Descripcion;
    private String Nombre;
    private LocalDate Fecha_compra;
    private LocalDate Fecha_creacion;
    private LocalDate ultima_modificacion;
    private long Valor_compra;
    private long Depreciacion;


}
