package com.depreciacion_prueba.depreciacion_prueba.controladores;


import com.depreciacion_prueba.depreciacion_prueba.clases.Inventario;
import com.depreciacion_prueba.depreciacion_prueba.java.java_inventario;
import com.depreciacion_prueba.depreciacion_prueba.service.servicio_inventario;
import com.depreciacion_prueba.depreciacion_prueba.utilidades.Inventario_mapeo;
import org.springframework.data.annotation.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/inventarios")
public class TaskControlador {

    private final servicio_inventario servicio_inv;

    public TaskControlador(servicio_inventario servicioInv) {
        servicio_inv = servicioInv;
    }


    @PostMapping
    public Inventario creInventario(@RequestBody java_inventario Java_inventario){
        return this.servicio_inv.crearInventario(Java_inventario);

    }

    @GetMapping
    public List<Inventario> findall(){

        return this.servicio_inv.findAll();

    }

    @PatchMapping("/depreciar({id}")
    public ResponseEntity<Void> Depreciar(@PathVariable("id") Long id){

        this.servicio_inv.Depreciar_Inventario(id);
        return ResponseEntity.noContent().build();

    }


}
