package application.domain.models;

import application.domain.valueobjects.WarehouseType;
import lombok.Getter;
import lombok.Setter;

/**
 * DOMINIO 4: espacios fisicos de almacenamiento. Se distinguen bodegas
 * del Marketplace y bodegas de Vendedores (ver subclases).
 */
@Getter
@Setter
public abstract class Bodega {
    private String identificador;
    private String nombre;
    private String ubicacion;
    private WarehouseType tipoBodega;
}
