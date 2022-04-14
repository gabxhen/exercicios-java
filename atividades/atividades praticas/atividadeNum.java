
import java.util.Scanner;

public class atividadeNum {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int valor1, valor2, valor3;

    System.out.printf("Digite um número: ");
    valor1 = input.nextInt();

    System.out.printf("Digite um número: ");
    valor2 = input.nextInt();

    if(valor2 > valor1){
        valor3 = valor1;
        valor1 = valor2;
        valor2 = valor3;
    }
    
    System.out.printf("\nO maior número é: " + valor1);
    System.out.printf("\nO menor número é: " + valor2);

    }
    
}
