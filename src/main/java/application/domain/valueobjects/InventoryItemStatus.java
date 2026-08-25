package application.domain.valueobjects;

/**
 * Seccion 11: no se puede reservar inventario inexistente o marcado como "Danado".
 */
public final class InventoryItemStatus extends DomainCatalog {

    public static final InventoryItemStatus DISPONIBLE = new InventoryItemStatus(
            "DISPONIBLE", "Disponible", "Las existencias pueden ser reservadas o vendidas.");
    public static final InventoryItemStatus DANADO = new InventoryItemStatus(
            "DANADO", "Danado", "Las existencias no pueden ser reservadas ni comercializadas.");

    private InventoryItemStatus(String code, String name, String description) {
        super(code, name, description);
    }
}
