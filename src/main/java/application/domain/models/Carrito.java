package application.domain.models;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DOMINIO 7 (paso 1 del ciclo del pedido): seleccion provisional de
 * productos, previa a la confirmacion del pedido.
 */
@Getter
@Setter
@NoArgsConstructor
public class Carrito {
    private String identificador;
    private Comprador comprador;
    private List<ItemCarrito> items = new ArrayList<>();
}
