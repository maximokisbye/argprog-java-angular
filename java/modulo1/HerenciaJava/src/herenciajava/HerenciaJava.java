package herenciajava;

public class HerenciaJava {

    public static void main(String[] args) {
        // crear una instancia de Empleado
        Empleado emp;
        
        // asignar valores a sus variables miembro
        emp = new Empleado("Ramon", 320000);
        
        // es posible asignar valores a las variables heredadas de Persona?
        emp.setGenero('M');
        emp.setEdad(25);
        emp.setDireccion("Oro 2309, Capital Federal.");
        
        // mostrar el resultado de las asignaciones
        System.out.println(emp.toString());
        
        // repetir la tarea creando una instancia de Cliente
        Cliente c;
        c = new Cliente(true);
        c.setNombre("Gabriela");
        c.setGenero('F');
        c.setEdad(54);
        c.setDireccion("Milito 77, Avellaneda, Buenos Aires.");
        System.out.println(c.toString());
    }
}