package application.domain.models;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ItemPedido {
    private Producto producto;
    private VarianteProducto variante;
    private int cantidad;
    private BigDecimal precioUnitario;
}
