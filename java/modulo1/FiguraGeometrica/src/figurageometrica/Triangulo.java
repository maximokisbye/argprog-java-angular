package figurageometrica;
public class Triangulo extends FiguraGeometrica {
    
    private float valor2;

    public Triangulo(float valor) {
        // convoca al constructor del padre
        super(valor);
        this.valor2 = 0;
    }

    public Triangulo(float valor2, float valor) {
        // convoca al constructor del padre
        super(valor);
        // asigna parametro a valor2
        this.valor2 = valor2;
    }

    public float getValor2() {
        return this.valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }
    
    @Override
    public float getArea() {
        // convoca al mismo metodo en el padre (emite mensaje)
        super.getArea();
        // calcular y retornar resultado;
        return (float) valor * valor2 / 2;
    }

    @Override
    public float getPerimetro() {
        // convoca al mismo metodo en el padre (emite mensaje)
        super.getPerimetro();
        // calcular y retornar resultado;
        return (float) Math.pow((Math.pow(valor, 2) + Math.pow(valor2, 2)), 1/2);
    }
}
