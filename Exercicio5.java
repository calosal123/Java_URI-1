import java.util.Scanner;

public class Exercicio5{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float dist, velMedia, tempo, consumo; 

        System.out.println("Digite o tempo de viagem");
        tempo = teclado.nextFloat();
        System.out.println("Digite a velocidade media");
        velMedia = teclado.nextFloat();

        // com base no tempo e na velocidade, calculo a distancia => v = d/t --> d = v * t

        dist = velMedia * tempo;
        consumo = dist/ 12;

        System.out.println("Foram consumidos "+consumo+" litros de combustivel");
    }
}