// Nome: Sabrina Custódio Brito
// Matrícula: 1252211621341

import java.util.Scanner;
public class Exercicio3 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número:");
        double a = entrada.nextDouble();
        double resultado = a * 4.95;

        System.out.println("Resultado da Adição: " + resultado);
        entrada.close();
    }
}
