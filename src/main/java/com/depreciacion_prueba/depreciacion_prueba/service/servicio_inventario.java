package com.depreciacion_prueba.depreciacion_prueba.service;

import com.depreciacion_prueba.depreciacion_prueba.clases.Inventario;
import com.depreciacion_prueba.depreciacion_prueba.java.java_inventario;
import com.depreciacion_prueba.depreciacion_prueba.repositorio.repositorio_inventario;
import com.depreciacion_prueba.depreciacion_prueba.utilidades.Inventario_mapeo;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class servicio_inventario {

    private final repositorio_inventario repositorio;
    private final Inventario_mapeo mapeo;

    public servicio_inventario(repositorio_inventario repositorio, Inventario_mapeo mapeo) {
        this.repositorio = repositorio;
        this.mapeo = mapeo;

    }

    public Inventario crearInventario(java_inventario inven) {

        Inventario inventario1 = mapeo.map(inven);
        return this.repositorio.save(inventario1);
    }

    public List <Inventario> findAll (){

        return this.repositorio.findAll();

    }

    @Transactional
    public void Depreciar_Inventario(Long id){
        this.repositorio.depreciar_articulo(id);
    }


}
