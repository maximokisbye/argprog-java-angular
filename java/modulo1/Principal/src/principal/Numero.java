/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author maxim
 */

public class Numero {
    
    private int valor;
    
    public Numero(int valor){
        this.valor = valor;
    }
    
    public void mostrar(){
       System.out.println(this.valor);
    }
    
    public int sumar(int valor){
        this.valor = this.valor + valor;
        return this.valor;
    }
    
    public int sumar(Numero numero){
        this.valor = this.valor + numero.valor;
        return this.valor;
    }
    
}
