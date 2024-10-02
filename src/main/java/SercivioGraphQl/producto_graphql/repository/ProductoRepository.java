package SercivioGraphQl.producto_graphql.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import SercivioGraphQl.producto_graphql.entities.Producto;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByNombreContainingIgnoreCase(String nombre);
}