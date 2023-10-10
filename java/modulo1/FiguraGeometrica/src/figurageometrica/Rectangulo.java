package figurageometrica;
public class Rectangulo extends FiguraGeometrica {
    
    private float valor2;

    public Rectangulo(float valor2, float valor) {
        // convoca al constructor del padre
        super(valor);
        this.valor2 = valor2;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }
    
    @Override
    public float getArea() {
        // convoca al mismo metodo en el padre (emite mensaje)
        super.getArea();
        // calcular y retornar resultado;
        return (float) valor * valor2;
    }

    @Override
    public float getPerimetro() {
        // convoca al mismo metodo en el padre (emite mensaje)
        super.getPerimetro();
        // calcular y retornar resultado;
        return (float) valor * 2 + valor2 * 2;
    }
}
