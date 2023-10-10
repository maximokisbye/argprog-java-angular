package figurageometrica;

public class Circulo extends FiguraGeometrica {

    public Circulo(float valor) {
        // convoca al constructor del padre
        super(valor);
    }

    @Override
    public float getArea() {
        // convoca al mismo metodo en el padre (emite mensaje)
        super.getArea();
        // calcular y retornar resultado;
        return (float) (Math.PI * Math.pow(valor, 2));
    }

    @Override
    public float getPerimetro() {
        // convoca al mismo metodo en el padre (emite mensaje)
        super.getPerimetro();
        // calcular y retornar resultado
        return (float) (2 * Math.PI * valor);
    }
}
