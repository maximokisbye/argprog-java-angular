package zoologico;
import java.util.ArrayList;
import java.util.List;

class Jaula<T> {

    // indique variable miembro
    private List<T> animales;

    public Jaula() {
        // inicialice variable miembro
        this.animales = new ArrayList<>();
    }

    public void asignarAnimal(T animal) {
        // agregue el animal al almacenamiento
        animales.add(animal);
    }
    
    public void vaciarJaula(){
        for(T animal : animales){
            animales.remove(animal);
        }
    }

    public void eliminarAnimal(T animal) {
        // elimine un animal del almacenamiento
        animales.remove(animal);
    }

    public void mostrarAnimales() {
        // recorra el almacenamiento mostrando cada animal
        for(T animal : animales){
            System.out.println(animal.toString());
        }
    }
}
