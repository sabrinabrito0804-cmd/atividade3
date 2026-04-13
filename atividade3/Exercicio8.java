// Nome: Sabrina Custódio Brito
// Matrícula: 1252211621341

package atividade3;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tente adivinhar o número secreto (1 a 100):");
        int tentativas = 1;
        boolean validacao = false;

        while (tentativas <= 5) {
            System.out.printf("Tentativa %d: ", tentativas);
            int numero = entrada.nextInt();
            if(numero < 1 || numero > 100) {
                System.out.println("O espaço de números é apenas de 1 a 100");
                break;
            }

            if (numero == 42) {
               validacao = true;
                break;
            }
            else {            
                tentativas++;
                if(numero > 42) {
                    System.out.println("Muito alto. Tente um número menor");
                }
                else {
                    System.out.println("Muito baixo. Tente um número mais alto");
                }
            } 
        }
        if (validacao == true) {
            System.out.println("Parabéns! Você acertou ");

        }
        else System.out.println("Você não acertou. O número secreto era 42.");
        entrada.close();
        
}}





