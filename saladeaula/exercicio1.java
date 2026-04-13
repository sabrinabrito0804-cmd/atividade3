package saladeaula;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o peso da caixa A:");
        int a = entrada.nextInt();
        System.out.print("Digite o peso da caixa B:");
        int b = entrada.nextInt();
        int limiteC = 250;       

        int soma = a + b;
        
        if (soma < limiteC) {
            System.out.println("Operação Segura.");
        } else {
            System.out.println("Alerta de Sobrecarga!");
        }

    
        entrada.close();
    }
}
