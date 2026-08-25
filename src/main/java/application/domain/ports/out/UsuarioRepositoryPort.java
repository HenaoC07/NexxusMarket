package application.domain.ports.out;

import application.domain.models.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioRepositoryPort {

    Usuario save(Usuario usuario);

    Optional<Usuario> findByIdentificador(String identificador);

    Optional<Usuario> findByCorreoElectronico(String correoElectronico);

    boolean existsByIdentificador(String identificador);

    boolean existsByCorreoElectronico(String correoElectronico);

    List<Usuario> findAll();

    void update(Usuario usuario);
}
