package saladeaula;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número:");
        int numero = entrada.nextInt();
        
        if (numero % 2 == 0) {
            int quadrado = numero * numero;
            System.out.println("Par. Quadrado: " + quadrado);
        } else {
            int cubo = numero * numero * numero;
            System.out.println("Ímpar. Cubo: " + cubo);
        }

        entrada.close();
    }
}
