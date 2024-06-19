package com.depreciacion_prueba.depreciacion_prueba.utilidades;

import com.depreciacion_prueba.depreciacion_prueba.java.java_inventario;

import com.depreciacion_prueba.depreciacion_prueba.clases.Inventario;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Inventario_mapeo implements Imapeo<java_inventario, Inventario>{

    @Override
    public Inventario map(java_inventario in){
        Inventario inv = new Inventario();
        inv.setDescripcion(in.getDescripcion());
        inv.setNombre(in.getNombre());
        inv.setNro_serial(in.getNro_serial());
        inv.setValor_compra(in.getValor_compra());
        inv.setFecha_compra(LocalDate.now());
        inv.setFecha_creacion(LocalDate.now());
        inv.setUltima_modificacion(LocalDate.now());
        //long reg = (long) in.getValor_compra();
        inv.setDepreciacion((long) (in.getValor_compra()*0.04));
        return inv;
    }

}
