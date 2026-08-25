package application.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DOMINIO 5: diferencias de color, talla, modelo, etc. dentro de un
 * mismo producto.
 */
@Getter
@Setter
@NoArgsConstructor
public class VarianteProducto {
    private String identificador;
    private String atributo;
    private String valor;
}
