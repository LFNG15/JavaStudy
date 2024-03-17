package estruturasdecontrole.exercícios;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int divisores = 0;

        System.out.println(" Digite o valor para verificar se é primo");
        int num = entrada.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % 1 == 0){
                divisores++;
            }
        }

        switch (divisores) {
            case 0:
                    System.out.println(" O numero " + num + " é primo.");
                    break;
            default:
                    System.out.println(" O numero " + num + " não é primo.");
        }

        entrada.close();
    }
}
