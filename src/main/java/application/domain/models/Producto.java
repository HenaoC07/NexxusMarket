package application.domain.models;

import application.domain.valueobjects.ProductStatus;
import application.domain.valueobjects.ProductType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DOMINIO 5: bienes fisicos o digitales ofrecidos en el catalogo publico.
 */
@Getter
@Setter
@NoArgsConstructor
public class Producto {
    private String identificador;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private ProductType tipoProducto;
    private ProductStatus estado;
    private Vendedor vendedor;
    private List<VarianteProducto> variantes = new ArrayList<>();
}
