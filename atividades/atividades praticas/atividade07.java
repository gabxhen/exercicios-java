
import java.util.Scanner;

public class atividade07 {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    double parcela, diasAtraso, valorJ, totalJ, valorF;

        System.out.print("Digite o valor da parcela R$ ");
        parcela = input.nextDouble();

        System.out.print("Digite quantos foram os dias de atraso: ");
        diasAtraso = input.nextDouble();

        System.out.print("Digite o valor do juros por dia R$ ");
        valorJ = input.nextDouble();

        totalJ = diasAtraso * valorJ;
        valorF = parcela + totalJ;
        

        System.out.printf("O valor total do juros foi de " + totalJ);
        System.out.printf("\nO valor da parcela com juros é de R$ " + valorF);
    }

}