package pruebatiempo;

public class PruebaTiempo {
    public static void main(String[] args) {
        
        // Crear varios objetos Tiempo       
        // Utilizar los constructores sobrecargados
        // Verificar todo el funcionamiento de la clase Tiempo
        
        Tiempo t1 = new Tiempo();
        System.out.println("Tiempo 1: " + t1);
        Tiempo t2 = new Tiempo(11);
        System.out.println("Tiempo 2: " + t2);
        Tiempo t3 = new Tiempo(14,12);
        System.out.println("Tiempo 3: " + t3);
        Tiempo t4 = new Tiempo(15,13,13);
        System.out.println("Tiempo 4: " + t4);
        
        t1.establecerTiempo(5,21,44);
        System.out.println("Nuevo tiempo 1: " + t1);
        
        System.out.println("Tiempo 2 utilizando .aStringUniversal: " + t2.aStringUniversal());
        
        System.out.println("Tiempo 3 utilizando .toString: " + t3.toString());

        
    }
}