package zoologico;
public class Serpiente extends Reptil {

    private String nombre;

    public Serpiente(String nombre, boolean escamas, boolean carnivoro) {
        super(escamas, carnivoro);
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Serpiente: " + nombre;
    }
}
