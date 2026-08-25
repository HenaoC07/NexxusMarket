package application.domain.ports.out;

import application.domain.models.Bodega;
import application.domain.models.Vendedor;
import java.util.List;
import java.util.Optional;

public interface BodegaRepositoryPort {

    Bodega save(Bodega bodega);

    Optional<Bodega> findByIdentificador(String identificador);

    List<Bodega> findByVendedor(Vendedor vendedor);

    List<Bodega> findAll();

    void update(Bodega bodega);
}
