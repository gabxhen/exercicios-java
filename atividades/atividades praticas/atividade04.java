
import java.util.Scanner;

public class atividade04 {
    public static void main(String[] args){
    
    Scanner input = new Scanner (System.in);
    
    double valorTotal;
    double valorGaso, valorEtanol, valorGnv; // Valores por litro.
    double abastGaso, abastEtanol, abastGnv; // Litros abastecidos.
    double totalGaso, totalEtanol, totalGnv; // valorTotal de cada litro.

    
    valorGaso = 7.199;
    valorEtanol = 5.419;
    valorGnv = 4.259 / 1000;

    System.out.print("Digite quantos litros abasteceu de Gasolina: ");
    abastGaso = input.nextDouble();
    
    System.out.print("Digite quantos litros abasteceu de Etanol: ");
    abastEtanol = input.nextDouble();

    System.out.print("Digite quantos litros abasteceu de GNV: ");
    abastGnv =  input.nextDouble();
    
    totalGaso = abastGaso  * valorGaso;
    totalEtanol =  abastEtanol * valorEtanol;
    totalGnv = abastGnv * valorGnv;

    valorTotal = totalGaso + totalEtanol + totalGnv;

    System.out.printf("Valor Gasolina: %.2f", totalGaso);
    System.out.printf("\nValor Etanol: %.2f", totalEtanol);
    System.out.printf("\nValor GNV: %.2f", totalGnv);
    System.out.printf("\nValor tota do abastecimento: %.2f", valorTotal);
    }
}