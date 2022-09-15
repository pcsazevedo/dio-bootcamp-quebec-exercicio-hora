package aula;

public class Metodos {

    public static void getSoma( int a, int b){

        int total = a + b;

        System.out.println("A soma de : " + a  + " mais "  +  b + " é = "  + total);

    }

    public static void getSubtracao(int a, int b){

        int resultado = a - b;

        System.out.println("A subração de " + a + " menos " + b + " é = " + resultado);
    }

    public static void getMultiplicacao(int a, int b){

        int total = a * b;

        System.out.println("A multiplicação de " + a +" X " + b + " = " + total);
    }

    public static void  getDivisao(int numero1, int numero2){

        int total = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " / " + numero2 + " = " + total);
    }

}
