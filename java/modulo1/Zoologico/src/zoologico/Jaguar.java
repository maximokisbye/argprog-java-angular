package zoologico;
public class Jaguar extends Mamifero {

    private String nombre;

    public Jaguar(String nombre,String tipoPelaje, boolean enCelo) {
        super(tipoPelaje,enCelo);
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Jaguar: " + nombre;
    }
}


