package capaLogicaNegocio;

import capaAccesoDatos.UsuarioAccesoDatos;

public class UsuarioServicio {
    public void saludarUsuario(String nombre) {
        UsuarioAccesoDatos usuarioAccesoDatos = 
                new UsuarioAccesoDatos();
        String mensaje = 
                usuarioAccesoDatos.obtenerMensajeSaludo(nombre);
        
        // Llamada a la capa de persistencia
        System.out.println(mensaje);
    }
    
    public void edadUsuario(int edad){
        UsuarioAccesoDatos usuarioAccesoDatos = 
            new UsuarioAccesoDatos();
        String mensaje = usuarioAccesoDatos.obtenerEdad(edad);       
        
        // Llamada a la capa de persistencia
        System.out.println(mensaje);
    }
}




