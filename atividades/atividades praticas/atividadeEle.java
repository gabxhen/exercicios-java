import java.util.Scanner;

public class atividadeEle {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    String eleito1, eleito2, eleito3;
    int votos1, votos2, votos3;
    

    System.out.print("[1] Digite o nome do PRIMEIRO candidato: ");
    eleito1 = input.next();

    System.out.print("[1] Quantos votos o PRIMEIRO candidato obteve: ");
    votos1 = input.nextInt();



    System.out.print("[2] Digite o nome do SEGUNDO candidato: ");
    eleito2 = input.next();

    System.out.print("[2] Quantos votos o SEGUNDO candidato obteve: ");
    votos2 = input.nextInt();



    System.out.print("[3] Digite o nome do TERCEIRO candidato: ");
    eleito3 = input.next(); 

    System.out.print("[3] Quantos votos o TERCEIRO candidato obteve: ");
    votos3 = input.nextInt();


    if (votos1 > votos2 && votos1 > votos3){
        System.out.printf("O vencedor da eleição é: " + eleito1);
    }
    else if (votos2 > votos1 && votos2 > votos3){
        System.out.printf("O vencedor da eleição é: " + eleito2);
    }
    else if (votos3 > votos1 && votos3 > votos2){
        System.out.printf("O vencedor da eleição é: " + eleito3);
    }


    }
}