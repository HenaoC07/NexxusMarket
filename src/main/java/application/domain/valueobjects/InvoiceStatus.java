package application.domain.valueobjects;

public final class InvoiceStatus extends DomainCatalog {

    public static final InvoiceStatus PENDIENTE = new InvoiceStatus(
            "PENDIENTE", "Pendiente", "La factura aun no ha sido emitida.");
    public static final InvoiceStatus EMITIDA = new InvoiceStatus(
            "EMITIDA", "Emitida", "La factura fue generada tras la confirmacion del pago.");
    public static final InvoiceStatus ANULADA = new InvoiceStatus(
            "ANULADA", "Anulada", "La factura fue anulada.");

    private InvoiceStatus(String code, String name, String description) {
        super(code, name, description);
    }
}
