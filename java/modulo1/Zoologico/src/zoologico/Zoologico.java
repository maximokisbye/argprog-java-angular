package zoologico;

public class Zoologico {

    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        zoo.imprimirResultado();
    }

    public static String compararAnimales(Animal anim1, Animal anim2) {

        // Modifique el metodo para hacer las pruebas
        Animal mayor;
        if(anim1.getEdad()> anim2.getEdad()){
            mayor = anim1;
        } else {
            mayor = anim2;
        }
        return "El animal mas viejo entre " + anim1.getNombre() + " y " + anim2.getNombre() + " es " + mayor.getNombre();
    }

    public void imprimirResultado() {
        
        
        ejecutarPruebasGenericidad();

        // Modifique el resultado para que muestre el String resultante 
        // del metodo compararAnimales
        Jaguar jaguar = new Jaguar("Juan", "Rojizo", true);
        jaguar.setEdad(6);
        Serpiente serpiente = new Serpiente("Cobra", true, true);
        serpiente.setEdad(23);
        System.out.println("____________________________");
        System.out.println("Se van a comparar animales");
        System.out.println(compararAnimales(jaguar, serpiente));
    }

    public void ejecutarPruebasGenericidad() {
        // Cree las jaulas y siga los pasos de la guia
        Jaula<Jaguar> jaulaJaguares;
        jaulaJaguares = new Jaula<>();
        
        // Creo los jaguares
        Jaguar j1 = new Jaguar("Juan", "Rojizo", true);
        Jaguar j2 = new Jaguar("Michi", "Amarillo", false);
        Jaguar j3 = new Jaguar("Juana", "Lacio", true);
        
        // Los meto en la jaulaJaguares
        jaulaJaguares.asignarAnimal(j1);
        jaulaJaguares.asignarAnimal(j2);
        jaulaJaguares.asignarAnimal(j3);
        
        System.out.println("Jaguares en jaula de Jaguares: ");
        jaulaJaguares.mostrarAnimales();    // Muestro en consola el contenido de la jaulaJaguares
        
        // Pruebo con serpiente
        Serpiente serpiente = new Serpiente("Anaconda", true, true);
        /* jaulaJaguares.asignarAnimal(serpiente); */
        // Serpiente no es jaguar por lo tanto no es posible asignarla
        
        Jaula<Animal> jaula = new Jaula<>();
        jaula.asignarAnimal(serpiente);     // Ahora si la podemos asignar
        // Asi tambien podemos integrar los jaguares y cualquier otro animal
        jaula.asignarAnimal(j3);
        Orangutan orang = new Orangutan("Negro", false, 230, true);
        jaula.asignarAnimal(orang);
        
        System.out.println("_______________________________");
        System.out.println("Animales en nueva jaula: ");
        jaula.mostrarAnimales();
    }
}
