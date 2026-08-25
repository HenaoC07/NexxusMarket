package application.domain.valueobjects;

/**
 * DOMINIO 7: ciclo de vida formal del pedido.
 * CARRITO -> PENDIENTE_PAGO -> PAGADO -> DESPACHADO -> ENTREGADO_FINALIZADO
 */
public final class OrderStatus extends DomainCatalog {

    public static final OrderStatus CARRITO = new OrderStatus(
            "CARRITO", "Carrito", "Seleccion provisional de productos, aun sin confirmar.");
    public static final OrderStatus PENDIENTE_PAGO = new OrderStatus(
            "PENDIENTE_PAGO", "Pendiente de Pago", "El pedido espera confirmacion financiera.");
    public static final OrderStatus PAGADO = new OrderStatus(
            "PAGADO", "Pagado", "El pago fue validado; inicia el proceso de alistamiento.");
    public static final OrderStatus DESPACHADO = new OrderStatus(
            "DESPACHADO", "Despachado", "El pedido salio fisicamente de la bodega.");
    public static final OrderStatus ENTREGADO_FINALIZADO = new OrderStatus(
            "ENTREGADO_FINALIZADO", "Entregado / Finalizado", "Conclusion satisfactoria de la entrega.");

    private OrderStatus(String code, String name, String description) {
        super(code, name, description);
    }
}
