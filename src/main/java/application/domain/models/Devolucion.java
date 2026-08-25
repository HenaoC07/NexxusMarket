package application.domain.models;

import application.domain.valueobjects.ReturnStatus;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * OBJ-11: administracion de devoluciones y reembolsos.
 */
@Getter
@Setter
@NoArgsConstructor
public class Devolucion {
    private String identificador;
    private Pedido pedido;
    private String motivo;
    private ReturnStatus estado;
    private LocalDateTime fechaSolicitud;
}
