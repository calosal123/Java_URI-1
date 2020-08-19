import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hI, hF, du;

        hI = teclado.nextInt();
        hF = teclado.nextInt();

        du = hF - hI;

        // se o resultado de DU for POSITIVO --> que iniciou e terminou no mesmo dia
        //    ou seja, hF é maior que hI
        // porém, pode ser que DU seja NEGATIVO ou ZERO
        //    ou seja, iniciou em um dia e terminou em outro
        //    desta forma, precisamos "somar 1 dia nesse cálculo", ou seja, 24h

        if (du <= 0){
            du = du + 24;
        }
        System.out.println("O JOGO DUROU "+du+" HORA(S)");

    }
}