package capaPresentacion;
import capaLogicaNegocio.UsuarioServicio;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del usuario:");
        String nombre = scanner.nextLine();
                
        System.out.println("Ingrese edad del usuario:");
        int edad = scanner.nextInt();
        
        // Llamada a la capa de lógica de negocio
        UsuarioServicio usuarioServicio = new UsuarioServicio();
        usuarioServicio.saludarUsuario(nombre);
        usuarioServicio.edadUsuario(edad); 
    }
}



