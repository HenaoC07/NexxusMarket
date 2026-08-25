package application.domain.ports.out;

import application.domain.models.Bodega;
import application.domain.models.ItemInventario;
import application.domain.models.MovimientoInventario;
import application.domain.models.Producto;
import java.util.List;
import java.util.Optional;

public interface InventarioRepositoryPort {

    ItemInventario save(ItemInventario item);

    Optional<ItemInventario> findByProductoAndBodega(Producto producto, Bodega bodega);

    List<ItemInventario> findByProducto(Producto producto);

    void update(ItemInventario item);

    MovimientoInventario registrarMovimiento(MovimientoInventario movimiento);
}
