package application.domain.models;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DOMINIO 3: los vendedores no pueden auto-registrarse; son incorporados
 * por el Administrador.
 */
@Getter
@Setter
@NoArgsConstructor
public class Vendedor extends Usuario {
    private String razonComercial;
    private Administrador registradoPor;
    private List<Bodega> bodegas = new ArrayList<>();
    private List<Producto> productos = new ArrayList<>();
}
