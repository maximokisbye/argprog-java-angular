package figurageometrica;
public class Cuadrado extends FiguraGeometrica {

    public Cuadrado(float valor) {
        // convoca al constructor del padre
        super(valor);
    }

    @Override
    public float getArea() {
        // convoca al mismo metodo en el padre (emite mensaje)
        super.getArea();
        // calcular y retornar resultado;
        return (float) valor * valor;
    }

    @Override
    public float getPerimetro() {
        // convoca al mismo metodo en el padre (emite mensaje)
        super.getPerimetro();
        // calcular y retornar resultado;
        return (float) valor * 4; 
    }
}
