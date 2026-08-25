package application.domain.ports.out;

import application.domain.models.Envio;
import application.domain.models.OperadorLogistico;
import application.domain.models.Pedido;
import java.util.List;
import java.util.Optional;

public interface EnvioRepositoryPort {

    Envio save(Envio envio);

    Optional<Envio> findByPedido(Pedido pedido);

    List<Envio> findByOperador(OperadorLogistico operador);

    void update(Envio envio);
}
