package application.domain.valueobjects;

public final class WarehouseType extends DomainCatalog {

    public static final WarehouseType MARKETPLACE = new WarehouseType(
            "MARKETPLACE", "Bodega del Marketplace", "Bodega administrada directamente por la plataforma.");
    public static final WarehouseType VENDEDOR = new WarehouseType(
            "VENDEDOR", "Bodega del Vendedor", "Bodega administrada y de propiedad de un vendedor.");

    private WarehouseType(String code, String name, String description) {
        super(code, name, description);
    }
}
