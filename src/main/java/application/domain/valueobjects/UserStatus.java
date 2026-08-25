package application.domain.valueobjects;

public final class UserStatus extends DomainCatalog {

    public static final UserStatus ACTIVO = new UserStatus(
            "ACTIVO", "Activo", "El usuario puede operar con normalidad en el sistema.");
    public static final UserStatus INACTIVO = new UserStatus(
            "INACTIVO", "Inactivo", "El usuario existe pero no puede realizar operaciones.");
    public static final UserStatus BLOQUEADO = new UserStatus(
            "BLOQUEADO", "Bloqueado", "El acceso del usuario ha sido suspendido.");

    private UserStatus(String code, String name, String description) {
        super(code, name, description);
    }
}
