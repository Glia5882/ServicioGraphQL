package SercivioGraphQl.producto_graphql.mutations;

import SercivioGraphQl.producto_graphql.entities.Producto;
import SercivioGraphQl.producto_graphql.repository.ProductoRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ProductoMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto createProducto(String nombre, String descripcion, float precio) {
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setDescripcion(descripcion);
        producto.setPrecio(precio);
        return productoRepository.save(producto);
    }

}
