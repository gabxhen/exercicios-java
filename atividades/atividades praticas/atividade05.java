
import java.util.Scanner;

public class atividade05 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in); 

        double salarioAnt, percentual, pAumento, salarioNovo;

        System.out.print("Digite o salário atual: ");
        salarioAnt = input.nextDouble();

        System.out.print("Digite o aumento percentual em %: ");
        percentual = input.nextDouble();

        pAumento = salarioAnt * (percentual / 100);

        salarioNovo = salarioAnt + pAumento;

        System.out.println("Seu saláriro novo é de R$ " + salarioNovo);
    }

}