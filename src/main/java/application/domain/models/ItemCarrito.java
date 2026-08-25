package application.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ItemCarrito {
    private Producto producto;
    private VarianteProducto variante;
    private int cantidad;
}
