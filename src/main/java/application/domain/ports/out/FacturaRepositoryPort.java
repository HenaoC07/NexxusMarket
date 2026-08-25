package application.domain.ports.out;

import application.domain.models.Factura;
import application.domain.models.Pedido;
import java.util.Optional;

public interface FacturaRepositoryPort {

    Factura save(Factura factura);

    Optional<Factura> findByPedido(Pedido pedido);

    void update(Factura factura);
}
