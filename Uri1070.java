import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X = teclado.nextInt();

        // como eu tenho certeza que X vai começar num impar??
        // verifico se ele é par, porque se for par, eu avanço 1 valor
        if (X%2 == 0){  // é par?
            X++;        // somo 1, pq aí torno o X ímpar
        }

        // sei contar até 6?
        for (int cont=1; cont <= 6; cont++){
            System.out.println(X);    // imprimo o X
            X = X + 2;                // vou para o próximo ímpar
        }




    }
}