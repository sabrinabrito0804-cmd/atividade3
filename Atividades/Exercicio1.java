// Nome: Sabrina Custódio Brito
// Matrícula: 1252211621341

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        double a = entrada.nextDouble();
        System.out.print("Digite o segundo número:");
        double b = entrada.nextDouble();
        double resultadosoma = a + b;
        double resultadosub = a - b;
        double resultadomult = a * b;
        double resultadodiv = a / b;

        System.out.println("Resultado da Adição: " + resultadosoma);
        System.out.println("Resultado da Subtração: " + resultadosub);
        System.out.println("Resultado da Multiplicação: " + resultadomult);
        System.out.println("Resultado da Divisão: " + resultadodiv);

        entrada.close();
    }
}
