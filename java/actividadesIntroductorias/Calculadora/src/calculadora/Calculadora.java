package calculadora;// indicar el nombre del paquete

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int resultado = 0;
        float resultFloat = 0;

        System.out.println("Ingresa el primer valor:");
        int a = entrada.nextInt();

        System.out.println("Ingresa el segundo valor:");
        int b = entrada.nextInt();

        resultado = sumar(a, b);
        System.out.println("El resultado de la suma es:" + resultado);

        resultado = restar(a, b);
        System.out.println("El resultado de la resta es " + resultado);

        resultado = multiplicar(a, b);
        System.out.println("El resultado de la multiplicación es " + resultado);

        resultFloat = dividir(a, b);
        System.out.println("El resultado de la división es " + resultFloat);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static float dividir(int a, int b) {
        return a / b;
    }
}