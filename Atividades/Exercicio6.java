// Nome: Sabrina Custódio Brito
// Matrícula: 1252211621341

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
        System.out.print("Digite a altura:");
        double a = entrada.nextDouble();
        System.out.print("Digite a base:");
        double b = entrada.nextDouble();
        double resultado = a * b;

        System.out.println("Resultado da Área: " + resultado + " cm²");

        entrada.close();
    }
}
