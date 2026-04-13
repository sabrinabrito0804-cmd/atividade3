// Nome: Sabrina Custódio Brito
// Matrícula: 1252211621341

package atividade8;
import java.util.Scanner;
public class exercicio1 {
    public static int maior (int a, int b) {
       
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main (String[] args){
int maximo = maior(10,4);
System.out.println(maximo);
} }