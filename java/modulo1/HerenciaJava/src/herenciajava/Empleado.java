package herenciajava;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
        // convocar al constructor con un parametro del Padre
        // inicializar variables
        super(nombre);
        contadorEmpleado++;
        this.idEmpleado = contadorEmpleado;
        this.sueldo = sueldo;
        
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}' + super.toString();
    } 
}