package application.domain.models;

import application.domain.valueobjects.InventoryMovementType;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MovimientoInventario {
    private String identificador;
    private ItemInventario itemInventario;
    private InventoryMovementType tipoMovimiento;
    private int cantidad;
    private LocalDateTime fechaMovimiento;
    private Usuario responsable;
}
