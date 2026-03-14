// Nome: Sabrina Custódio Brito
// Matrícula: 1252211621341

import java.util.Scanner;
public class Exercicio5 {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a primeira nota:");
        double a = entrada.nextDouble();
        System.out.print("Digite a segundo nota:");
        double b = entrada.nextDouble();
        System.out.print("Digite a terceira nota:");
        double c = entrada.nextDouble();
        double resultado = a + b + c;
        double resultadom = resultado / 3;

        System.out.printf("Resultado da Média: " + resultadom);
    
        entrada.close();
    }
}
