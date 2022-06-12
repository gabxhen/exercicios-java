import java.util.Scanner;

public class atividadeMedia {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    while(true){
        double notaFinal, mediaFinalrp; // Criando Variáveis para caso o usuário vá para final.

        System.out.print("\nDigite a media: "); 
        final double MEDIA = input.nextDouble();

        if(MEDIA >= 0 && MEDIA <= 10) { // Se a média for maior ou igual a 0 e menor e igual a 10, entre nesse bloco de código.
            if(MEDIA >= 3 && MEDIA < 6){
                System.out.print("Digite a nota da final: ");
                notaFinal = input.nextDouble();

                mediaFinalrp = (MEDIA + notaFinal) / 2;

                if(mediaFinalrp >= 6){
                    System.out.print("Você foi aprovado na final.");
                }
                else{
                    System.out.print("Você foi reprovado na final.");
                }
            }
            else {
                if(MEDIA >= 6){
                    System.out.print("Você foi aprovado.");
                }
                else{
                    System.out.print("Você foi reprovado.");
                }
            }

            break; // Após testar todas as ocasioes, ele irá quebrar aqui.
        } 
        // Fim do bloco, caso o usuário nao tenha colocado uma media entre 0 e 10, ela passa para linha seguinte.

        System.out.print("Digite um valor válido.");
    }
    
    }
}