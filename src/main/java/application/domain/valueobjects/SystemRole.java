package application.domain.valueobjects;

/**
 * RG-02: cada usuario tiene un unico rol dentro del sistema.
 */
public final class SystemRole extends DomainCatalog {

    public static final SystemRole COMPRADOR = new SystemRole(
            "COMPRADOR", "Comprador", "Usuario que adquiere productos publicados en el marketplace.");
    public static final SystemRole VENDEDOR = new SystemRole(
            "VENDEDOR", "Vendedor", "Responsable de registrar y administrar sus productos.");
    public static final SystemRole OPERADOR_LOGISTICO = new SystemRole(
            "OPERADOR_LOGISTICO", "Operador Logistico", "Encargado de la operacion fisica de bodegas y despachos.");
    public static final SystemRole ADMINISTRADOR = new SystemRole(
            "ADMINISTRADOR", "Administrador", "Responsable de la administracion de vendedores y bodegas.");
    public static final SystemRole SUPERVISOR = new SystemRole(
            "SUPERVISOR", "Supervisor", "Perfil de consulta y seguimiento operativo.");

    private SystemRole(String code, String name, String description) {
        super(code, name, description);
    }
}
