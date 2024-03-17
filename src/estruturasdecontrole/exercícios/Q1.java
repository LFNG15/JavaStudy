package estruturasdecontrole.exercícios;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número e verifique se é par ou impar");

        int num = entrada.nextInt();
        if (num % 2 == 0){
            System.out.println("O numero " + num + "é par" );
        } else {
            System.out.println("O numero " + num + "é impar");
        }
        entrada.close();
    }
}
