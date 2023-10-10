package capaPersistencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductoDAO {

    private Map<Integer, Producto> productos;

    public ProductoDAO() {
        productos = new HashMap<>();
    }

    public void guardar(Producto product) {
        // Lógica para guardar un producto en la base de datos
        productos.put(product.getId(), product);
    }

    public void actualizar(Producto product) {
        // Lógica para actualizar un producto en la base de datos
        productos.put(product.getId(), product);
    }

    public void borrar(int productId) {
        // Lógica para eliminar un producto de la base de datos
        productos.remove(productId);
    }

    public Producto getById(int productId) {
        // Lógica para obtener un producto de la base de datos por su ID
        return productos.get(productId);
    }

    public List<Producto> getTodos() {
        // Lógica para obtener todos los productos de la base de datos
        return new ArrayList<>(productos.values());
    }
}