import java.util.Scanner;
public class TabuadaDeUmaLinha{
    public static void main(String args[]){
        for (int cont=0, num = (new Scanner(System.in)).nextInt(); cont<=10; System.out.println(num + " x "+cont+" = "+ (num * cont++)));
    }
}