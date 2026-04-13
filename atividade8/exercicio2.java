// Nome: Sabrina Custódio Brito
// Matrícula: 1252211621341

package atividade8;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero inteiro:");
        int numero = leitor.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é Par.");
        } else {
            System.out.println ("O número " + numero + " é impar.");
    }
    leitor.close();
}
}
