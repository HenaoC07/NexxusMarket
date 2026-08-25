package application.domain.models;

import application.domain.valueobjects.InvoiceStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DOMINIO/OBJ-09: informacion comercial asociada a las ventas.
 */
@Getter
@Setter
@NoArgsConstructor
public class Factura {
    private String identificador;
    private Pedido pedido;
    private BigDecimal montoTotal;
    private InvoiceStatus estado;
    private LocalDateTime fechaEmision;
}
