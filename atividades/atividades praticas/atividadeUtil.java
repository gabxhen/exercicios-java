
import java.util.Scanner;

public class atividadeUtil {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("[?] Digite o dia da semana: ");
    int diaSemana = input.nextInt();

    if(diaSemana == 1 || diaSemana == 7){
        System.out.println("Esse dia não é um dia útil.");
    }
    else{
        System.out.println("Esse dia é um dia útil.");
    }
    
    }

}