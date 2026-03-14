// Nome: Sabrina Custódio Brito
// Matrícula: 1252211621341

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
        System.out.print("Preço do produto: ");
        double a = entrada.nextDouble();
        System.out.print("Valor pago:  ");
        double b = entrada.nextDouble();
        double resultado = b - a;
        if (a < b);
            else System.out.println("Saldo insuficiente para a compra.");

        System.out.println("Troco: " + resultado );

        entrada.close();
    }
}