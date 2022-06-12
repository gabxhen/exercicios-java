
import java.util.Scanner;

public class atividadeIdade {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    double maiorAltura = 0;
    double altura;

    do{
        System.out.print("Digite sua altura: ");
        altura = input.nextDouble(); 
        
        if(altura > maiorAltura){
            maiorAltura = altura;
        }

    } while(altura != 0);


    System.out.print("A maior altura foi " + maiorAltura);


    }
}