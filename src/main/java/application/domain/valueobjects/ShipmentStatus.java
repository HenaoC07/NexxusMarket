package application.domain.valueobjects;

public final class ShipmentStatus extends DomainCatalog {

    public static final ShipmentStatus EN_PREPARACION = new ShipmentStatus(
            "EN_PREPARACION", "En Preparacion", "El pedido esta siendo empacado en bodega.");
    public static final ShipmentStatus DESPACHADO = new ShipmentStatus(
            "DESPACHADO", "Despachado", "El envio salio de la bodega de origen.");
    public static final ShipmentStatus EN_TRANSITO = new ShipmentStatus(
            "EN_TRANSITO", "En Transito", "El envio se encuentra en camino hacia el comprador.");
    public static final ShipmentStatus ENTREGADO = new ShipmentStatus(
            "ENTREGADO", "Entregado", "El envio fue entregado satisfactoriamente.");

    private ShipmentStatus(String code, String name, String description) {
        super(code, name, description);
    }
}
