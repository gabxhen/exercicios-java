import java.util.Scanner;

public class atividadeMaior {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double nota1, nota2, nota3, mediaT;

    System.out.print("[1] Digite a primeira nota: ");
    nota1 = input.nextDouble();

    System.out.print("[2] Digite a primeira nota: ");
    nota2 = input.nextDouble();

    System.out.print("[3] Digite a primeira nota: ");
    nota3 = input.nextDouble();

    if ((nota1 > nota2) && (nota3 > nota2)){
        mediaT = (nota1 + nota3) / 2;
        System.out.printf("A média é: " + mediaT);
    }
    else if((nota3 > nota1) && (nota2 > nota1)){
        mediaT = (nota3 + nota2) / 2;
        System.out.printf("A média é: " + mediaT);
    }
    else{
        mediaT = (nota1 + nota2) / 2;
        System.out.printf("A média é: " + mediaT);
    }
    
  }
}
    

