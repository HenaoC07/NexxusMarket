package application.domain.models;

import application.domain.valueobjects.OrderStatus;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DOMINIO 7: representa el compromiso comercial formal. Es el proceso
 * central del sistema. Un pedido finalizado no podra ser modificado.
 */
@Getter
@Setter
@NoArgsConstructor
public class Pedido {
    private String identificador;
    private Comprador comprador;
    private List<ItemPedido> items = new ArrayList<>();
    private OrderStatus estado;
    private LocalDateTime fechaCreacion;
    private String direccionEnvio;
}
