package application.domain.models;

import application.domain.valueobjects.BuyerStatus;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DOMINIO 2: el comprador nunca administra informacion de otros
 * compradores ni inventarios (restriccion clave).
 */
@Getter
@Setter
@NoArgsConstructor
public class Comprador extends Usuario {
    private String direccionPrincipal;
    private List<String> direccionesAdicionales = new ArrayList<>();
    private BuyerStatus estadoComercial;
}
