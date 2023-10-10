package herenciajava;

public class Persona {
    
    // variables miembro protected
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    //Constructor sin parametros
    public Persona() {
        // indicar valores por default
        this("",' ',0,"");
        
    }

    //Constructor con 1 argumento
    public Persona(String nombre) {
        // inicializar variable nombre
        this(nombre,' ',0,"");
    }

    //Constructor completo
    public Persona(String nombre, char genero, int edad, String direccion) {
        // asignar valores a todas las variables
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }  
}