
import java.util.Scanner;

public class atividade01p {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in); // aqui, estou declarando ao sistema que utilizarei o scanner e será dado como "input", mas poderia utilizar qualquer nome.

        int ingressoNormal, ingressoEstudante, ingressoAcessivel, publicoTotal;

        System.out.print("Quantos ingressos normais foram vendidos? ");
        ingressoNormal = input.nextInt(); // estou dizendo aqui que o ingressonormal, é o "input" do número inteiro que o usuário digitar, se o usuário digitar '10', o valor de ingressonormal será '10'.

        System.out.print("Quantos ingressos acessíveis foram vendidos? ");
        ingressoAcessivel = input.nextInt();

        System.out.print("Quantos ingressos estudantis foram vendidos? ");
        ingressoEstudante = input.nextInt();

        publicoTotal = ingressoNormal + ingressoEstudante + ingressoAcessivel;

        System.out.printf("A quantidade total de ingressos vendidos foi de: " + publicoTotal);
    }

}