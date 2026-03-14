// Nome: Sabrina Custódio Brito
// Matrícula: 1252211621341

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        int a = entrada.nextInt();
        System.out.print("Digite o segundo número:");
        int b = entrada.nextInt();
        int resultado = a % b;

        System.out.println("Resultado da Adição: " + resultado);
        entrada.close();
    }
}
