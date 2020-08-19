import java.util.Scanner;
public class Uri1144{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N;

        N = teclado.nextInt();
        for (int valor = 1; valor <= N; valor++){
            System.out.println(valor+" "+(valor*valor)+" "+(valor*valor*valor));
            System.out.println(valor+" "+(valor*valor+1)+" "+(valor*valor*valor+1));
        }
    }
}