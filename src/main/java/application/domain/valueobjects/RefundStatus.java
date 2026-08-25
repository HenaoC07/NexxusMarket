package application.domain.valueobjects;

public final class RefundStatus extends DomainCatalog {

    public static final RefundStatus PENDIENTE = new RefundStatus(
            "PENDIENTE", "Pendiente", "El reembolso aun no ha sido procesado.");
    public static final RefundStatus PROCESADO = new RefundStatus(
            "PROCESADO", "Procesado", "El reembolso fue efectuado al comprador.");
    public static final RefundStatus RECHAZADO = new RefundStatus(
            "RECHAZADO", "Rechazado", "El reembolso fue rechazado.");

    private RefundStatus(String code, String name, String description) {
        super(code, name, description);
    }
}
