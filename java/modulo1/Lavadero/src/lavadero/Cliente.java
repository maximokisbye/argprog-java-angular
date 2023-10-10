/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavadero;

/**
 *
 * @author maxim
 */
public class Cliente {
    
    private String apellido;
    private String nombre;
    private String dni;
    private Vehiculo auto;

    public Cliente(String apellido, String nombre, String dni, Vehiculo auto) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.auto = auto;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
}
