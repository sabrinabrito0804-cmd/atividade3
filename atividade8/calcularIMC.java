package atividade8;

import java.util.Scanner;

public class calcularIMC {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu peso:");
        double peso = entrada.nextDouble();
        System.out.print("Digite seu altura:");
        double altura = entrada.nextDouble();
        double resultado = peso / (altura * altura);

        if (resultado < 20) {
            System.out.println(resultado + ": Você está abaixo do peso!");
        }
        if ((resultado >20) && (resultado<30)) {
            System.out.println(resultado + ": Você está no peso normal!");

} else if (resultado > 30 ) {
                System.out.println(resultado + ": Você está acima do peso!");

        }}}

