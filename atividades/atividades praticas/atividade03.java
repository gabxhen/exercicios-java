import java.util.Scanner;

public class atividade03 {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    double valorProd, quantProd, valorTotal;

    System.out.print("Digite o valor do produto R$: ");
    valorProd = input.nextDouble();

    System.out.print("Digite a quantidade: ");
    quantProd = input.nextDouble();

    valorTotal = valorProd * quantProd;

    System.out.printf("O valor total é de: R$ %.2f" , valorTotal); // Para utilizar o comando "%.2f", precisa concatenar a variável com ",", com o "+", não funciona.
    }  
}
