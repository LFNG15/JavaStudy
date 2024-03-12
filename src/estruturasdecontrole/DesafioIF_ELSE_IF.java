package estruturasdecontrole;

import java.util.Scanner;

public class DesafioIF_ELSE_IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia: ");

        double dia = entrada.nextDouble();

        if(dia == 1) {
            System.out.println("É domingo");
        } else if(dia == 2) {
            System.out.println("É segunda feira");
        } else if(dia == 3) {
            System.out.println("É terça feira");
        } else if(dia == 4) {
           System.out.println("É quarta feira");
        } else if(dia == 5) {
            System.out.println("É quinta feira");
        } else if (dia == 6) {
            System.out.println("É sexta feira");
        } else if (dia == 7) {
            System.out.println("É sábado");
        }

        System.out.print("Digite o nome do dia: ");

        String dia1 = entrada.next();

        if(dia1.equalsIgnoreCase("domingo")) {
            System.out.println(1);
        } else if(dia1.equalsIgnoreCase("segunda")) {
            System.out.println(2);
        } else if(dia1.equalsIgnoreCase("terça")) {
            System.out.println(3);
        } else if(dia1.equalsIgnoreCase("quarta")) {
            System.out.println(4);
        } else if(dia1.equalsIgnoreCase("quinta")) {
            System.out.println(5);
        } else if (dia1.equalsIgnoreCase("sexta")) {
            System.out.println(6);
        } else if (dia1.equalsIgnoreCase("sabado")) {
            System.out.println(8);
        } else {
            System.out.println("Dia inválido");
        }


    }
}
