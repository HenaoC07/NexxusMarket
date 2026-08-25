package application.domain.ports.out;

import application.domain.models.Carrito;
import application.domain.models.Comprador;
import java.util.Optional;

public interface CarritoRepositoryPort {

    Carrito save(Carrito carrito);

    Optional<Carrito> findByComprador(Comprador comprador);

    void update(Carrito carrito);
}
