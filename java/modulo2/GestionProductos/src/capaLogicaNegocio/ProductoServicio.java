package capaLogicaNegocio;

import capaPersistencia.Producto;
import capaPersistencia.ProductoDAO;
import java.util.List;

public class ProductoServicio {

    private ProductoDAO productoDAO;

    public ProductoServicio() {
        productoDAO = new ProductoDAO();
    }

    public void crearProducto(int id, String nom, int pre) {
        // crear un objeto Producto
        Producto prod = new Producto(id, nom, pre);
        // agregarlo al almacenamiento
        productoDAO.guardar(prod);
    }

    public void actualizarProducto(int productoId, String nuevoNombre, int nuevoPrecio) {
        // obtener del almacenamiento el producto buscado
        Producto prod = productoDAO.getById(productoId);
        if(prod == null){
            System.out.println("Producto inexisistente");            
        // actualizar la informacion del producto
        } else {
            prod.setNombre(nuevoNombre);
            prod.setPrecio(nuevoPrecio);
            productoDAO.actualizar(prod);
            System.out.println("Producto actualizado con exito!");

        }
    }

    public void borrarProducto(int productoId) {
        // obtener del almacenamiento el producto buscado
     // Producto prod = productoDAO.getById(productoId);
        // eliminar el producto
        Producto prod = productoDAO.getById(productoId);
        if(prod == null){
            System.out.println("Producto inexisistente");            
        // actualizar la informacion del producto
        } else {
            productoDAO.borrar(productoId);
            System.out.println("Producto borrado!");
        }
    }

    public Producto getProducto(int productoId) {
        // obtener y devolver el producto buscado
        Producto prod = productoDAO.getById(productoId);  
        return prod;
    }

    public List<Producto> getTodosProductos() {
        // retornar todos los productos
        return productoDAO.getTodos();        
    }
}