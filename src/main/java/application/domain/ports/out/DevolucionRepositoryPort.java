package application.domain.ports.out;

import application.domain.models.Devolucion;
import application.domain.models.Pedido;
import java.util.List;
import java.util.Optional;

public interface DevolucionRepositoryPort {

    Devolucion save(Devolucion devolucion);

    Optional<Devolucion> findByIdentificador(String identificador);

    List<Devolucion> findByPedido(Pedido pedido);

    void update(Devolucion devolucion);
}
