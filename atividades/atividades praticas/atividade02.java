
import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int base, altura, area;
    
    System.out.print("Digite a base do triângulo: ");
    base = input.nextInt();

    System.out.print("Digite a altura do triângulo: ");
    altura = input.nextInt();

    area = (base * altura) / 2;

    System.out.printf("A área do triângulo é: " + area);
    }
}