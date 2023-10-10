package gestorcontactos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorContactos {
    Scanner entrada = new Scanner(System.in);
// se define la lista de los contactos
    private List<Contacto> libretaContactos;

// definir un constructor usando ArrayList para inicializar la libreta de contactos

    public GestorContactos() {
        this.libretaContactos = new ArrayList();
    }

    public void agregarContacto() {
        // se agrega un contacto
        System.out.println("Ingrese nombre de contacto: ");
        String nombre = entrada.next();
        System.out.println("Ingrese telefono de contacto: ");
        String telefono = entrada.next();
        Contacto contacto = new Contacto(nombre, telefono);
        libretaContactos.add(contacto);
    }

    public void eliminarContacto() {
        Contacto contactoEliminado = null;
        // si el contacto es el buscado entonces se elimina de la lista
        System.out.println("Ingresar nombre de contacto a eliminar: ");
        String nombreBorrar = entrada.next();
        for(Contacto c : libretaContactos) {
            if(c.getNombre().equalsIgnoreCase(nombreBorrar)){
                contactoEliminado = c;
            }
        }
        if (contactoEliminado != null){
            libretaContactos.remove(contactoEliminado);
            System.out.println("Contacto borrado exitosamente.");
        } else {
            System.out.println("No existe nombre con contacto a borrar.");
        }
    }

    public void buscarContacto() {
        boolean encontrado = false;
        // se busca el contacto y se muestra                
        // si no se encuentra, se informa la situación
        System.out.println("Ingresar nombre de contacto: ");
        String nombre = entrada.next();
        for(Contacto c : libretaContactos) {
            if(c.getNombre().equalsIgnoreCase(nombre)){
                encontrado = true;
                System.out.println("Nombre: " + c.getNombre() + " | Telefono: " + c.getTelefono());
            }
        }
        if(!encontrado){System.out.println("Contacto no encontrado.");}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorContactos gestor = new GestorContactos();

        while (true) {
            System.out.println("----- Menú Principal -----");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opcion) {
                case 1:
                    // agregar el contacto
                    gestor.agregarContacto();
                    break;
                case 2:
                    // eliminar el contacto
                    gestor.eliminarContacto();
                    break;
                case 3:
                    // buscar el contacto
                    gestor.buscarContacto();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");

            }

        }
    }
}