package application.domain.valueobjects;

public final class ReturnStatus extends DomainCatalog {

    public static final ReturnStatus SOLICITADA = new ReturnStatus(
            "SOLICITADA", "Solicitada", "El comprador registro la solicitud de devolucion.");
    public static final ReturnStatus APROBADA = new ReturnStatus(
            "APROBADA", "Aprobada", "La devolucion fue aprobada y procede el reembolso.");
    public static final ReturnStatus RECHAZADA = new ReturnStatus(
            "RECHAZADA", "Rechazada", "La devolucion fue rechazada.");
    public static final ReturnStatus COMPLETADA = new ReturnStatus(
            "COMPLETADA", "Completada", "El producto fue recibido de vuelta y el proceso concluyo.");

    private ReturnStatus(String code, String name, String description) {
        super(code, name, description);
    }
}
