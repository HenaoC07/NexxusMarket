package application.domain.ports.out;

import application.domain.models.Usuario;

/**
 * RG-01: toda operacion debe ejecutarse por un usuario autenticado.
 * RG-03: ningun participante puede administrar informacion fuera de su rol.
 */
public interface AuthorizationPort {

    boolean isAuthenticated(Usuario usuario);

    boolean hasRole(Usuario usuario, application.domain.valueobjects.SystemRole rol);

    boolean canOperateOn(Usuario usuario, Object recurso);
}
