package application.domain.ports.out;

import application.domain.models.Devolucion;
import application.domain.models.Reembolso;
import java.util.Optional;

public interface ReembolsoRepositoryPort {

    Reembolso save(Reembolso reembolso);

    Optional<Reembolso> findByDevolucion(Devolucion devolucion);

    void update(Reembolso reembolso);
}
