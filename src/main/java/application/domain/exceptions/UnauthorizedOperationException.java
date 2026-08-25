package application.domain.exceptions;

/**
 * RG-01: toda operacion debe ejecutarse por un usuario autenticado.
 * RG-03: ningun participante puede administrar informacion fuera de su rol.
 */
public class UnauthorizedOperationException extends DomainException {

    public UnauthorizedOperationException(String message) {
        super(message);
    }
}
