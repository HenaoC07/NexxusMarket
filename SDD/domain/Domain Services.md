# Servicios

## Introducción

Este documento presenta una visión conceptual de los servicios que componen el Sistema de Gestión de Marketplace **NexxusMarket**.

Los servicios aquí descritos definen las principales capacidades de negocio que expone el sistema. En este nivel, cada servicio se describe únicamente en términos de su propósito y responsabilidad dentro del dominio.

La definición detallada de cada servicio —incluyendo entradas, salidas, reglas de negocio, validaciones, requisitos de autorización, interacciones con el dominio, excepciones, consideraciones de persistencia e implementación técnica— se documentará en archivos separados organizados por **subdominio**.

La documentación de servicios se divide conceptualmente en los siguientes subdominios:

- **Gestión de Usuarios y Autenticación**
- **Gestión de Productos**
- **Gestión de Inventario y Bodegas**
- **Gestión de Carrito de Compras**
- **Gestión de Pedidos**
- **Gestión de Envíos**
- **Gestión de Facturación**
- **Gestión de Devoluciones y Reembolsos**
- **Autorización**

---

# Servicios de Gestión de Usuarios y Autenticación

## Registrar Comprador

Crea un nuevo usuario del tipo `Comprador`, estableciendo su información inicial y su estado dentro del marketplace.

## Registrar Vendedor

Crea un nuevo usuario del tipo `Vendedor`, asociándolo con su información comercial y estableciendo su estado inicial de operación dentro del marketplace.

## Registrar Operador Logístico

Crea un usuario del tipo `OperadorLogistico`, responsable de la gestión de envíos y entregas dentro del sistema.

## Registrar Usuario Interno

Crea un usuario interno de la plataforma, como `Administrador` o `Supervisor`, restringido a roles con privilegios administrativos según las reglas de autorización del negocio.

## Iniciar Sesión

Autentica a un usuario del sistema mediante sus credenciales registradas y establece una sesión autenticada.

## Consultar Usuario

Recupera la información de un usuario del sistema de acuerdo con los permisos de acceso del usuario solicitante.

## Actualizar Usuario

Actualiza la información mantenida para un usuario existente según las reglas de negocio aplicables.

## Cambiar Estado de Usuario

Cambia el estado operativo de un usuario, como activarlo, desactivarlo o bloquearlo, afectando su capacidad de operar dentro del marketplace.

---

# Servicios de Gestión de Productos

## Registrar Producto

Crea un nuevo `Producto` dentro del catálogo de un vendedor, estableciendo su información inicial y su estado.

## Registrar Variante de Producto

Crea una `VarianteProducto` asociada a un producto existente, representando una combinación específica de atributos (talla, color, presentación, entre otros).

## Consultar Producto

Recupera la información de un producto, incluyendo sus variantes, según los permisos del usuario solicitante.

## Actualizar Producto

Actualiza la información de un producto existente, como su descripción, precio o atributos, según las reglas de negocio aplicables.

## Cambiar Estado de Producto

Cambia el estado de un producto dentro del catálogo, como publicarlo, despublicarlo o descontinuarlo.

## Consultar Catálogo de Productos

Recupera el listado de productos disponibles en el marketplace, permitiendo su filtrado según criterios como vendedor, categoría o estado.

---

# Servicios de Gestión de Inventario y Bodegas

## Registrar Bodega

Crea una nueva `Bodega`, ya sea de tipo `BodegaMarketplace` o `BodegaVendedor`, estableciendo su configuración inicial.

## Consultar Bodega

Recupera la información de una bodega y su estado operativo según los permisos del usuario solicitante.

## Registrar Ítem de Inventario

Crea un `ItemInventario` asociando una variante de producto con una bodega y una cantidad disponible inicial.

## Consultar Inventario

Recupera las existencias disponibles de un producto o variante en una o varias bodegas.

## Registrar Movimiento de Inventario

Crea un `MovimientoInventario` que refleja una entrada, salida o ajuste sobre las existencias de un ítem de inventario, preservando la trazabilidad del cambio.

## Reservar Inventario

Reserva la cantidad de inventario necesaria para respaldar un pedido en proceso, evitando su disponibilidad para otras operaciones concurrentes.

## Liberar Inventario

Libera una reserva de inventario previamente realizada, por ejemplo ante la cancelación de un pedido, devolviendo la cantidad a las existencias disponibles.

## Validar Disponibilidad de Inventario

Determina si existe la cantidad suficiente de inventario disponible para respaldar una operación, como la confirmación de un pedido.

---

# Servicios de Gestión de Carrito de Compras

## Crear Carrito

Crea un nuevo `Carrito` de compras asociado a un comprador.

## Agregar Ítem al Carrito

Agrega un `ItemCarrito` al carrito de un comprador, validando la disponibilidad del producto o variante seleccionada.

## Actualizar Ítem del Carrito

Modifica la cantidad u otros atributos de un ítem existente dentro del carrito.

## Eliminar Ítem del Carrito

Elimina un ítem específico del carrito de compras de un comprador.

## Consultar Carrito

Recupera el contenido actual del carrito de un comprador, incluyendo sus ítems y el valor total estimado.

## Vaciar Carrito

Elimina todos los ítems contenidos en el carrito de un comprador.

---

# Servicios de Gestión de Pedidos

## Crear Pedido

Crea un nuevo `Pedido` a partir del contenido del carrito de un comprador, iniciando su ciclo de vida dentro del sistema.

## Consultar Pedido

Recupera la información de un pedido, incluyendo sus ítems y estado, según los permisos del usuario solicitante.

## Confirmar Pedido

Confirma un pedido tras validar la disponibilidad de inventario y demás condiciones aplicables, avanzando su estado dentro del flujo de negocio.

## Cancelar Pedido

Cancela un pedido existente, liberando el inventario reservado, siempre que el pedido no se encuentre en un estado finalizado.

## Cambiar Estado de Pedido

Actualiza el estado de un pedido conforme a las transiciones válidas definidas para su ciclo de vida.

## Consultar Historial de Pedidos

Recupera el listado de pedidos asociados a un comprador o vendedor según los permisos del usuario solicitante.

---

# Servicios de Gestión de Envíos

## Crear Envío

Crea un `Envio` asociado a un pedido confirmado, estableciendo su estado inicial.

## Asignar Operador Logístico

Asigna un `OperadorLogistico` responsable de gestionar el envío de un pedido.

## Actualizar Estado de Envío

Actualiza el estado de un envío conforme a su avance, como en tránsito, en reparto o entregado.

## Consultar Envío

Recupera la información y el estado actual de un envío según los permisos del usuario solicitante.

## Confirmar Entrega

Registra la entrega efectiva de un envío al comprador, finalizando su ciclo de vida.

---

# Servicios de Gestión de Facturación

## Generar Factura

Genera una `Factura` asociada a un pedido confirmado, registrando la información fiscal y comercial correspondiente.

## Consultar Factura

Recupera la información de una factura según los permisos del usuario solicitante.

## Anular Factura

Anula una factura previamente generada según las reglas de negocio aplicables, por ejemplo ante la cancelación de un pedido.

---

# Servicios de Gestión de Devoluciones y Reembolsos

## Solicitar Devolución

Crea una `Devolucion` a partir de un pedido entregado, iniciando su proceso de revisión.

## Aprobar Devolución

Aprueba una solicitud de devolución tras validar las condiciones y reglas de negocio aplicables.

## Rechazar Devolución

Rechaza una solicitud de devolución y registra la decisión correspondiente.

## Consultar Devolución

Recupera la información y el estado de una devolución según los permisos del usuario solicitante.

## Procesar Reembolso

Genera un `Reembolso` asociado a una devolución aprobada, gestionando la restitución del valor correspondiente al comprador.

## Consultar Reembolso

Recupera la información y el estado de un reembolso según los permisos del usuario solicitante.

---

# Servicios de Autorización

## Validar Permisos por Rol

Determina si un usuario tiene permiso para ejecutar una operación de negocio específica con base en su rol (`SystemRole`) y estado.

## Validar Acceso a Recurso de Vendedor

Determina si un usuario está autorizado para acceder u operar sobre información perteneciente a un vendedor específico, como su catálogo, inventario o pedidos.

## Validar Acceso a Recurso de Comprador

Determina si un usuario está autorizado para acceder u operar sobre información perteneciente a un comprador específico, como su carrito, pedidos o devoluciones.

## Validar Autorización de Operación Administrativa

Determina si un usuario cuenta con la autoridad requerida para ejecutar una operación restringida a roles administrativos, como la aprobación de devoluciones o el cambio de estado de otros usuarios.

---

# Organización de los Servicios

Los servicios descritos en este documento constituyen el **catálogo de servicios de alto nivel** del sistema.

Intencionalmente, no describen detalles de implementación ni flujos de negocio completos.

Las especificaciones detalladas se mantendrán en archivos Markdown independientes, organizados por subdominio. Por ejemplo:

```text
services/
│   └── user-authentication-services.md
│
│   └── product-services.md
│
│   └── inventory-warehouse-services.md
│
│   └── shopping-cart-services.md
│
│   └── order-services.md
│
│   └── shipment-services.md
│
│   └── invoice-services.md
│
│   └── return-refund-services.md
│
    └── authorization-services.md
```
