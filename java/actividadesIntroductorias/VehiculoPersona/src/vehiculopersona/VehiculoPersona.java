package vehiculopersona;

public class VehiculoPersona {

    public static void main(String[] args) {
        // Desarrollar resolucion
        Persona p = new Persona();
        p.leerDatos();
        p.mostrarDatos();
        // Ahora creo un segundo objeto con vehiculo
        System.out.println("Creando nuevo objeto vehiculo y nuevo objeto persona");
        Vehiculo v = new Vehiculo();
        v.leerDatos();
        Persona q = new Persona(41623555, "Juan", "Lopez", v);
        System.out.println("Persona de DNI: " + q.getDni() + ", debe $" + v.calcularImpuesto() + " del vehiculo patente: " + v.getPatente());       
    }
    
}