package com.depreciacion_prueba.depreciacion_prueba.repositorio;

import com.depreciacion_prueba.depreciacion_prueba.clases.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.Id;
import java.util.List;

public interface repositorio_inventario extends JpaRepository<Inventario, Long> {

    @Modifying
    @Query(value = "UPDATE INVENTARIO SET VALOR_COMPRA=VALOR_COMPRA*0.96 WHERE ID=:id", nativeQuery = true)
    public void depreciar_articulo(@Param("id") Long id);

}
