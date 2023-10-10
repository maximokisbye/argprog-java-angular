/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoracional;

import java.util.Scanner;

/**
 *
 * @author maxim
 */
public class CalculoRacional {
    
    Scanner entrada = new Scanner (System.in);
    Racional r1, r2;    
    
    public CalculoRacional(){
        r1 = new Racional();
        r2 = new Racional();
    }
    
    public static void main(String[] args) {
        CalculoRacional c = new CalculoRacional();
        c.menuOpciones();
    }
    
    
    public void ingresarRacionales() {
        System.out.println("Ingrese primer numero racional");
        r1.crear();
        System.out.println("Ingrese segundo numero racional");
        r2.crear();
    }
    
    public void multiplicacion(){
        r1.multiplicar(r2).ver();
    }
    
    public void division(){
        r1.dividir(r2).ver();
    }
    
    public void menuOpciones(){
        int opc = 9;
        while(opc != 0){
            switch(opc){
                case 1:
                   ingresarRacionales();
                    break;                    
                case 2:
                    multiplicacion();
                    break;
                case 3:
                    division();
                case 0:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            mostrarMenu();
            System.out.print("      Ingrese opcion: ");
            opc = entrada.nextInt();
        }
    }
    
    public void mostrarMenu(){
        System.out.println("CALCULO RACIONAL");
        System.out.println("1- Ingresar racionales");
        System.out.println("2- Operar multiplicacion");
        System.out.println("3- Operar division");
        System.out.println("0- Salir");
    }
    
    
}
