package SercivioGraphQl.producto_graphql.mutations;

import SercivioGraphQl.producto_graphql.entities.Producto;
import SercivioGraphQl.producto_graphql.repository.ProductoRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ProductoMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private ProductoRepository productoRepository;

    @Transactional
    @MutationMapping
    public Producto createProducto(@Argument String nombre, @Argument String descripcion, @Argument Float precio, @Argument String formato) {
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setDescripcion(descripcion);
        producto.setPrecio(precio);
        producto.setFormato(formato);
        return productoRepository.save(producto);
    }

}
