package application.domain.models;

import application.domain.valueobjects.ShipmentStatus;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * OBJ-10: gestion de los procesos logisticos (empaque, despacho y
 * transporte del pedido).
 */
@Getter
@Setter
@NoArgsConstructor
public class Envio {
    private String identificador;
    private Pedido pedido;
    private Bodega bodegaOrigen;
    private OperadorLogistico operadorResponsable;
    private ShipmentStatus estado;
    private LocalDateTime fechaDespacho;
    private LocalDateTime fechaEntrega;
}
