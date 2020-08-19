import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hI, mI, hF, mF, dI, dF, du, duH, duM;

        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        // vou converter as horas iniciais e finais para a unidade "minutos"
        dI = hI * 60 + mI;
        dF = hF * 60 + mF;
        // o raciocínio segue exatamente o mesmo do exercício 1046
        du = dF - dI;

        if (du <= 0){
            du = du + 24*60; // somo 24h na unidade que estou trabalhando (no caso, minutos)
        }
        duH = du/60;
        duM = du%60;

        System.out.println("O JOGO DUROU "+duH+" HORA(S) E "+duM+" MINUTO(S)");


    }
}