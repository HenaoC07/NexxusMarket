package application.domain.ports.out;

import application.domain.models.Vendedor;
import java.util.List;
import java.util.Optional;

public interface VendedorRepositoryPort {

    Vendedor save(Vendedor vendedor);

    Optional<Vendedor> findByIdentificador(String identificador);

    List<Vendedor> findAll();

    void update(Vendedor vendedor);
}
