package application.domain.models;

import application.domain.valueobjects.InventoryItemStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DOMINIO 6: el inventario es distribuido y debe estar vinculado
 * obligatoriamente a un producto y a una bodega especifica.
 * No se permiten existencias negativas bajo ninguna circunstancia.
 */
@Getter
@Setter
@NoArgsConstructor
public class ItemInventario {
    private String identificador;
    private Producto producto;
    private Bodega bodega;
    private int cantidadDisponible;
    private int cantidadReservada;
    private InventoryItemStatus estado;
}
