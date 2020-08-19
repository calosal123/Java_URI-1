import java.util.Scanner;
public class Uri2787{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int L, C;
        L = teclado.nextInt();
        C = teclado.nextInt();

        int rL, rC;
        rL = L % 2; // 0 ou 1
        rC = C % 2; 

        if (rL == 0 && rC == 0){
            System.out.println("1");
        }
        else if (rL == 1 && rC == 1){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }

}