package application.domain.valueobjects;

/**
 * DOMINIO 5: el catalogo diferencia productos fisicos (requieren inventario
 * y despacho) de productos digitales (entrega inmediata tras el pago).
 */
public final class ProductType extends DomainCatalog {

    public static final ProductType FISICO = new ProductType(
            "FISICO", "Producto Fisico", "Requiere inventario en bodega y despacho logistico.");
    public static final ProductType DIGITAL = new ProductType(
            "DIGITAL", "Producto Digital", "Se entrega de forma inmediata tras la confirmacion del pago.");

    private ProductType(String code, String name, String description) {
        super(code, name, description);
    }
}
