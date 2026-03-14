// Nome: Sabrina Custódio Brito
// Matrícula: 1252211621341

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
        System.out.print("Digite a temperatura em Celsius:");
        double a = entrada.nextDouble();
        double resultadof = (a * 9.0/5) + 32;
        double resultadok = a + 273.15;


        System.out.println("Fahrenheit: " + resultadof + " Km/l");
        System.out.println("Kelvin: " + resultadok + " Km/l");

        entrada.close();    }
}
