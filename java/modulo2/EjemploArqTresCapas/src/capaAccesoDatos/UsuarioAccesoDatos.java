package capaAccesoDatos;

public class UsuarioAccesoDatos {
    public String obtenerMensajeSaludo(String nombre) {
        // Lógica para obtener el mensaje de saludo 
        // de la base de datos
        String mensaje = "Hola, " + nombre + "! Bienvenido.";
        return mensaje;
    }
    
    public String obtenerEdad(int edad) {
        // Lógica para obtener la edad de la base de datos
        String mensaje = "Tu edad es: " + edad;
        return mensaje;
    }
}




