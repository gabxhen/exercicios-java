import java.util.Scanner;

public class atividadePar {

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    
    System.out.print("Digite um número: ");
    double numero = input.nextDouble();

    if(numero % 2 == 0){
        System.out.println("O número é pár");
    }
    else{
        System.out.println("O número é ímpar.");
    }

    }
}
