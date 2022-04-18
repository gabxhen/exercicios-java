import java.util.Scanner;

public class atividadeCarro {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    double nivelCar, nivelReg, totalMin;

    System.out.print("[?] Digite a capacidade em Litros do carro pipa: ");
    nivelCar = input.nextDouble();

    System.out.print("[?] Digite o nível de regulagem: ");
    nivelReg = input.nextDouble();
    
    if(nivelReg == 1){
        totalMin = nivelCar / 12.5;
        System.out.print("Serão necessários: " + totalMin + " min.");
    }
    else if(nivelReg == 2){
        totalMin = nivelCar / 25;
        System.out.print("Serão necessários: " + totalMin + " min.");
    }
    else{
        totalMin = nivelCar / 50;
        System.out.print("Serão necessários: " + totalMin + " min.");
    }

    }
}
