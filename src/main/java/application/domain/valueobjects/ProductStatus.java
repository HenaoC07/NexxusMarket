package application.domain.valueobjects;

public final class ProductStatus extends DomainCatalog {

    public static final ProductStatus PUBLICADO = new ProductStatus(
            "PUBLICADO", "Publicado", "El producto es visible en el catalogo publico.");
    public static final ProductStatus SUSPENDIDO = new ProductStatus(
            "SUSPENDIDO", "Suspendido", "El producto no es visible temporalmente en el catalogo.");
    public static final ProductStatus DESCONTINUADO = new ProductStatus(
            "DESCONTINUADO", "Descontinuado", "El producto ya no se comercializa en la plataforma.");

    private ProductStatus(String code, String name, String description) {
        super(code, name, description);
    }
}
