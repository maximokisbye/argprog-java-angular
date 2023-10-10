package cafeteria;

public class Cafetero {
    private String nombre;
    
    public Cafetero(String nombre){
        this.nombre = nombre;
    }
    
    public void sirveCafe(){
        System.out.println(nombre + " sirve el café al cliente...");
    }
    
    public void cobrarCafe(){
        System.out.println(nombre + " le cobra el café al cliente...");
    }    
}