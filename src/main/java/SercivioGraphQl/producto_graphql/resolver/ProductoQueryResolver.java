package SercivioGraphQl.producto_graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import SercivioGraphQl.producto_graphql.entities.Producto;
import SercivioGraphQl.producto_graphql.repository.ProductoRepository;

import java.util.List;

@Controller
public class ProductoQueryResolver {

    @Autowired
    private ProductoRepository productoRepository;

    // Método para resolver la búsqueda de productos por nombre
    @QueryMapping
    public List<Producto> buscarProductos(String nombre) {
        return productoRepository.findByNombreContainingIgnoreCase(nombre);
    }
}
