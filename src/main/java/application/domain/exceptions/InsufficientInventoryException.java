package application.domain.exceptions;

/**
 * Seccion 11: no se permitiran existencias negativas bajo ninguna circunstancia,
 * ni se puede reservar inventario inexistente o marcado como "Danado".
 */
public class InsufficientInventoryException extends DomainException {

    public InsufficientInventoryException() {
        super("Insufficient available inventory to complete the operation.");
    }
}
