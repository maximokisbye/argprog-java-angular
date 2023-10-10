package vehiculopersona;

import java.util.Scanner;

public class Vehiculo {
    private int patente;
    private String marca;
    private String modelo;
    private String color;
    private float valor;
    Scanner entrada = new Scanner(System.in);
    
    public Vehiculo(int patente, String marca, String modelo, String color, float valor) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.valor = valor;
    }

    Vehiculo() {
        this.patente = 0;
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.valor = 0;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }   
    
    public void Vehiculo() {
        this.patente = 0;
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.valor = 0;
    }
    
    public void leerDatos() {
        System.out.println("Inserte nro de patente");
        setPatente(entrada.nextInt());
        System.out.println("Inserte marca");
        setMarca(entrada.next());
        System.out.println("Inserte modelo");
        setModelo(entrada.next());
        System.out.println("Inserte color");
        setColor(entrada.next());
        System.out.println("Inserte valor");
        setValor(entrada.nextFloat());        
    }
    public void mostrarDatos() {
        System.out.println("Patente nro: "+getPatente());
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Color: "+getColor());
        System.out.println("Valor: "+getValor());
    }
    public float calcularImpuesto() {
        // System.out.println(getValor()*0.03);
        return (float) (getValor()*0.03);
    }
}