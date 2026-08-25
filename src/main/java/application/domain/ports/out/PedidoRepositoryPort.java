package application.domain.ports.out;

import application.domain.models.Comprador;
import application.domain.models.Pedido;
import java.util.List;
import java.util.Optional;

public interface PedidoRepositoryPort {

    Pedido save(Pedido pedido);

    Optional<Pedido> findByIdentificador(String identificador);

    List<Pedido> findByComprador(Comprador comprador);

    void update(Pedido pedido);
}
