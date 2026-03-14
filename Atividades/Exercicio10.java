// Nome: Sabrina Custódio Brito
// Matrícula: 1252211621341

import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
        System.out.print("Distância (km): ");
        double d = entrada.nextDouble();
        System.out.print("Velocidade média (km/h):  ");
        double v = entrada.nextDouble();
        double tempoHoras = d / v;
        int horas = (int) tempoHoras;
        int minutos = (int) ((tempoHoras - horas) * 60);


        System.out.println("Tempo Estimado: " + horas + " horas e " + minutos + " minutos.");

        entrada.close();
    }
}