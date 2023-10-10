package capaPresentacion;

import capaLogicaNegocio.ProductoServicio;
import java.util.Scanner;

public class Gestionproductos {

    Scanner entrada = new Scanner(System.in);
    
    private ProductoServicio productoServicio;

    public Gestionproductos() {
        productoServicio = new ProductoServicio();
    }

    public static void main(String[] args) {
        Gestionproductos main = new Gestionproductos();
        main.run();
    }

    public void run() {
        // definir el menu con la convocacion de metodos,
        // y la seleccion de la opcion  
        int opc = 0;
        while(opc != 6) {
            System.out.println("=== GESTIÓN DE PRODUCTOS ===");
            System.out.println("1. Crear producto");
            System.out.println("2. Actualizar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar producto");
            System.out.println("5. Mostrar todos los productos");
            System.out.println("6. Salir");
            System.out.println("Selecciona una opción:");
            
            opc = entrada.nextInt();
            switch(opc){
                case 1 -> crearProducto();
                case 2 -> actualizarProducto();
                case 3 -> borrarProducto();
                case 4 -> mostrarProducto();
                case 5 -> mostrarTodosProductos();
            }
        }
    }

    private void crearProducto() {
        // dar entrada al codigo, nombre y precio del 
        // nuevo producto
        System.out.println("Ingrese codigo de nuevo producto: ");
        int cod = entrada.nextInt();
        System.out.println("Ingrese nombre de nuevo producto: ");
        String nom = entrada.next();
        System.out.println("Ingrese precio de nuevo producto: ");
        int pre = entrada.nextInt();
        // crear el objeto de tipo ProductoServicio
        productoServicio.crearProducto(cod, nom, pre);
        // informar que la creacion fue exitosa
        System.out.println("Producto creado con exito!");
    }

    public void actualizarProducto() {
        // ingresar la identificacion del producto a actualizar
        System.out.println("Ingrese codigo del producto a actualizar: ");
        int cod = entrada.nextInt();
        // ingresar el nombre y el nuevo precio del producto
        System.out.println("Ingrese nuevo nombre del producto a actualizar: ");
        String nuevoNombre = entrada.next();
        System.out.println("Ingrese nuevo precio del producto a actualizar: ");
        int nuevoPrecio = entrada.nextInt();
        // actualizar el objeto de tipo ProductoServicio
        productoServicio.actualizarProducto(cod, nuevoNombre, nuevoPrecio);
    }

    public void borrarProducto() {
        // ingresar la identificacion del producto a eliminar
        System.out.println("Ingrese codigo de producto a eliminar: ");
        int cod = entrada.nextInt();
        // borrar el producto
        productoServicio.borrarProducto(cod);
    }

    public void mostrarProducto() {
        // ingresar la identificacion del producto a mostrar
        System.out.println("Ingrese codigo de producto a mostrar: ");
        int cod = entrada.nextInt();
        // mostrar el producto
        if (productoServicio.getProducto(cod) == null){
            System.out.println("Porducto no encontrado.");
        } else {   
            String nombre = productoServicio.getProducto(cod).getNombre();
            int precio = productoServicio.getProducto(cod).getPrecio();
            System.out.println("Nombre: " + nombre + ". Precio: " + precio);
        }
    }

    public void mostrarTodosProductos() {
        // mostrar todos los producto
        for(int i = 0; i < productoServicio.getTodosProductos().size(); i++){
            String nombre = productoServicio.getTodosProductos().get(i).getNombre();
            int precio = productoServicio.getTodosProductos().get(i).getPrecio();
            System.out.println("Nombre: " + nombre + ". Precio: " + precio);
        }
    }
}