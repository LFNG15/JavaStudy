package estruturasdecontrole;

public class DesafioIF {
    public static void main(String[] args){
        double nota = 1.3;

        if(nota >= 9.0) {
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera!!!");
        }
        if(nota >= 8.0 && nota <= 8.9)
            System.out.println("Parabéns, tirou muito acima da média");

        if(nota >= 7 && nota <=7.9)
            System.out.println("Aprovado");

        if(nota <=6.9 && nota <=5)
            System.out.println("Recuperação");

        if(nota < 5)
            System.out.println("Está reprovado");
    }
}
