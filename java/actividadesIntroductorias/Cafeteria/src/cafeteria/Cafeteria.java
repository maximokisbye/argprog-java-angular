package cafeteria;

public class Cafeteria {

    public static void main(String[] args) {
        Cafetero juan = new Cafetero("Juan");
        Cliente cliente = new Cliente();
        
        cliente.pedirCafe();
        juan.cobrarCafe();
        cliente.pagaCafe();
        juan.sirveCafe();
        cliente.tomarCafe();
        cliente.seVa();
    }
}