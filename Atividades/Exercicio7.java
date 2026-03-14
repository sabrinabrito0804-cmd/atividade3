// Nome: Sabrina Custódio Brito
// Matrícula: 1252211621341

import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
        System.out.print("Digite a distância percorrida (km):");
        double a = entrada.nextDouble();
        System.out.print("Digite Combustível gasto (litros): ");
        double b = entrada.nextDouble();
        double resultado = a / b;

        System.out.println("Consumo médio: " + resultado + " Km/l");

        entrada.close();
    }
}
