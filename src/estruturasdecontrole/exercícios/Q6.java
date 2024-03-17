package estruturasdecontrole.exercícios;

import java.util.Random;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int continuar;
        int numSorteado;
        int tentativas;
        int num;

        do {
            System.out.println("Sorteando numero entre 0 e 100...\n");
            Random numeroAleatorio = new Random();
            numSorteado = numeroAleatorio.nextInt(101);

            System.out.println("Começou o jogo! Sera que consegue me vencer?");
            tentativas = 0;

            do {
                tentativas++;
                System.out.printf("Tentativa %d: ", tentativas);
                num = entrada.nextInt();

                if (num > numSorteado) {

                    System.out.printf("\nO numero sorteado e menor que %d\n\n", num);

                } else if (num < numSorteado) {

                    System.out.printf("\nO numero sorteado e maior que %d\n\n", num);

                } else {

                    System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);
                    break;
                }

            } while (tentativas != 10);

            System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
            continuar = entrada.nextInt();

        } while (continuar != 0);

        entrada.close();
    }
}
