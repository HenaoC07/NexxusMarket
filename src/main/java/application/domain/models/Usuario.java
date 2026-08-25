package application.domain.models;

import application.domain.valueobjects.SystemRole;
import application.domain.valueobjects.UserStatus;
import lombok.Getter;
import lombok.Setter;

/**
 * DOMINIO 1: base de autenticacion e identificacion del Marketplace.
 * Comun a todos los participantes (Comprador, Vendedor, Operador Logistico,
 * Administrador, Supervisor). RG-02: un unico rol por usuario.
 */
@Getter
@Setter
public abstract class Usuario {
    private String identificador;
    private String nombreCompleto;
    private String correoElectronico;
    private SystemRole rol;
    private UserStatus estado;
}
