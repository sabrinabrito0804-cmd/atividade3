// Nome: Sabrina Custódio Brito
// Matrícula: 1252211621341

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        double salario = entrada.nextDouble();
        double salarionovo = salario * 1.07;

        System.out.println("Resultado do Reajuste: R$" + salarionovo);
        entrada.close();
    }
}
