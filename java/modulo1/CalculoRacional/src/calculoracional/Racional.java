/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculoracional;

import java.util.Scanner;

/**
 *
 * @author maxim
 */
public class Racional {
    
    private int numerador;
    private int denominador;
    Scanner entrada = new Scanner (System.in);
    
    public Racional() {
        this.numerador = 0;
        this.denominador = 1;
    }
    
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public void ver(){
        System.out.println(getNumerador() + "/" + getDenominador());
    }
    
    public void crear() {
        System.out.println("Ingrese Numerador: ");
        setNumerador(entrada.nextInt());
        System.out.println("Ingrese Denominador: ");
        setDenominador(entrada.nextInt());
    }
    
    public Racional multiplicar(Racional r) {
        Racional result = new Racional();
        result.setNumerador(getNumerador() * r.getNumerador());
        result.setDenominador(getDenominador() * r.getDenominador());
        return result;
    }
    
    public Racional dividir(Racional r) {
        Racional result = new Racional();
        result.setNumerador(getNumerador() * r.getDenominador());
        result.setDenominador(getDenominador() * r.getNumerador());
        return result;
    }
}
