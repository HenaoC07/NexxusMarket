package application.domain.valueobjects;

/**
 * DOMINIO 6: movimientos permitidos sobre el inventario distribuido.
 */
public final class InventoryMovementType extends DomainCatalog {

    public static final InventoryMovementType INGRESO = new InventoryMovementType(
            "INGRESO", "Ingreso", "Entrada de existencias nuevas a la bodega.");
    public static final InventoryMovementType RESERVA = new InventoryMovementType(
            "RESERVA", "Reserva", "Apartado de existencias por un pedido en proceso.");
    public static final InventoryMovementType SALIDA_VENTA = new InventoryMovementType(
            "SALIDA_VENTA", "Salida por Venta", "Descuento de existencias por una venta confirmada.");
    public static final InventoryMovementType AJUSTE = new InventoryMovementType(
            "AJUSTE", "Ajuste", "Correccion manual de existencias.");
    public static final InventoryMovementType DEVOLUCION = new InventoryMovementType(
            "DEVOLUCION", "Devolucion", "Reingreso de existencias producto de una devolucion.");

    private InventoryMovementType(String code, String name, String description) {
        super(code, name, description);
    }
}
