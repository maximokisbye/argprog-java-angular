package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("__ CASO 1 __");
        System.out.print("Ingrese el valor del primer numero: ");
        Numero n1 = new Numero(entrada.nextInt());
        System.out.print("Ingrese el valor del segundo numero: ");
        int val = entrada.nextInt();
        n1.sumar(val);
        System.out.print("El resultado de la suma de los numeros es = ");
        n1.mostrar();
        
        System.out.println("__ CASO 2 __");
        System.out.print("Ingrese el valor del primer numero: ");
        Numero n2 = new Numero(entrada.nextInt());
        System.out.print("Ingrese el valor del segundo numero: ");
        Numero n3 = new Numero(entrada.nextInt());
        n2.sumar(n3);
        System.out.print("El resultado de la suma de los numeros es = ");
        n2.mostrar();        
    }
    
}

