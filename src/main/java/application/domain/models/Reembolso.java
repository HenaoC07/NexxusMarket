package application.domain.models;

import application.domain.valueobjects.RefundStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Reembolso {
    private String identificador;
    private Devolucion devolucion;
    private BigDecimal monto;
    private RefundStatus estado;
    private LocalDateTime fechaProcesado;
}
