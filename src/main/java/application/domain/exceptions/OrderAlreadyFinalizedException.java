package application.domain.exceptions;

/**
 * Seccion 11: un pedido finalizado no podra ser modificado bajo ninguna
 * circunstancia.
 */
public class OrderAlreadyFinalizedException extends DomainException {

    public OrderAlreadyFinalizedException() {
        super("A finalized order cannot be modified.");
    }
}
