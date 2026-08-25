package application.domain.exceptions;

/**
 * Seccion 11: el documento de identidad y el correo electronico deben ser
 * unicos en la plataforma.
 */
public class DuplicateIdentifierException extends DomainException {

    public DuplicateIdentifierException(String field, String value) {
        super("The value '" + value + "' for field '" + field + "' is already registered.");
    }
}
