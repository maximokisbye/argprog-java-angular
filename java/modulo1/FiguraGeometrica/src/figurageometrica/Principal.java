package figurageometrica;

public class Principal {

    public static void main(String[] args) {
        
        // se crea una referencia del tipo Figura
        FiguraGeometrica figura;
        // se le asigna un objeto de tipo Circulo (un Circulo tambien es una Figura!)
        figura = new Circulo(5);
        // mediante el metodo getClass es posible conocer cual es el tipo del objeto referenciado
        System.out.println("\n\nClase: " + figura.getClass());
        // se efectua el calculo solicitado para el tipo Circulo
        System.out.println(" Figura " + " Area: " + figura.getArea());
        System.out.println(" Figura " + " Perimetro: " + figura.getPerimetro());
        // Repite las mismas tareas para cada clase hija
        FiguraGeometrica rec = new Rectangulo(3,4);
        System.out.println("\n\nClase: " + rec.getClass());
        System.out.println(" Figura " + " Area: " + rec.getArea());
        System.out.println(" Figura " + " Perimetro: " + rec.getPerimetro());   
        
        FiguraGeometrica tri = new Triangulo(3,4);
        System.out.println("\n\nClase: " + tri.getClass());
        System.out.println(" Figura " + " Area: " + tri.getArea());
        System.out.println(" Figura " + " Perimetro: " + tri.getPerimetro()); 
        
        FiguraGeometrica cuad = new Cuadrado(7);
        System.out.println("\n\nClase: " + cuad.getClass());
        System.out.println(" Figura " + " Area: " + cuad.getArea());
        System.out.println(" Figura " + " Perimetro: " + cuad.getPerimetro()); 
    }
}
