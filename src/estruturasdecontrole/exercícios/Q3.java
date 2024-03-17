package estruturasdecontrole.exercícios;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota parcial: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota parcial: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Sua média foi " + media + " e você está aprovado");
        } else if (media >= 4) {
            System.out.println("Sua média foi " + media + " e você está de recuperação");
        } else {
            System.out.println("Sua média foi " + media + " e você está reprovado");
        }
        entrada.close();
    }
}
