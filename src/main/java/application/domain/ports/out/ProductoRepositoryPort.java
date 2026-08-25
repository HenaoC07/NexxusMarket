package application.domain.ports.out;

import application.domain.models.Producto;
import application.domain.models.Vendedor;
import java.util.List;
import java.util.Optional;

public interface ProductoRepositoryPort {

    Producto save(Producto producto);

    Optional<Producto> findByIdentificador(String identificador);

    List<Producto> findByVendedor(Vendedor vendedor);

    List<Producto> findPublicados();

    void update(Producto producto);
}
