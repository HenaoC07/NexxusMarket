package application.domain.valueobjects;

public final class BuyerStatus extends DomainCatalog {

    public static final BuyerStatus ACTIVO = new BuyerStatus(
            "ACTIVO", "Activo", "El comprador puede realizar compras con normalidad.");
    public static final BuyerStatus RESTRINGIDO = new BuyerStatus(
            "RESTRINGIDO", "Restringido", "El comprador tiene limitaciones temporales para comprar.");
    public static final BuyerStatus SUSPENDIDO = new BuyerStatus(
            "SUSPENDIDO", "Suspendido", "El comprador no puede realizar compras.");

    private BuyerStatus(String code, String name, String description) {
        super(code, name, description);
    }
}
