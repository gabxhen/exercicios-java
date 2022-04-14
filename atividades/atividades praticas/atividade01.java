
import java.util.Scanner;

public class atividade01 { 
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int diasViagem, horasViagem, horasTotais;

    System.out.print("Digite quantos dias: ");
    diasViagem = input.nextInt();

    System.out.print("Digite quantas horas: ");
    horasViagem = input.nextInt();

    horasTotais = (diasViagem * 24) + horasViagem;

    System.out.printf("O total de horas de duração da viagem foram de " + horasTotais);
    System.out.print(" horas.");
    }
}
