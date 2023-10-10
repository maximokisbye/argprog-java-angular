package vehiculopersona;

import java.util.Scanner;

public class Persona {
    Scanner entrada = new Scanner (System.in);
    
    private int dni;
    private String nombre;
    private String apellido;
    private Vehiculo auto;

    public Persona(int dni, String nombre, String apellido, Vehiculo auto) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }
      
    
    
    public Persona() {
        this.dni = 0;
        this.nombre = "";
        this.apellido = "";
        this.auto = new Vehiculo();
    }
    
    public void leerDatos() {
        System.out.println("Inserte nro de DNI:");
        setDni(entrada.nextInt());
        System.out.println("Inserte nombre:");
        setNombre(entrada.next());
        System.out.println("Inserte apellido:");
        setApellido(entrada.next());
        System.out.println("Ingrese los datos del vehiculo:");
        auto = new Vehiculo();
        auto.leerDatos();
    }
    public void mostrarDatos() {
        System.out.println("DNI: "+getDni());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Modelo de vehiculo: "+auto.getPatente());
    }
    public void mostrarImpuestoVehiculo() {
    }
}