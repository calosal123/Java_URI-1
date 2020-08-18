import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod, qtd;
        double total, valorItem;

        cod = teclado.nextInt();
        qtd = teclado.nextInt();

        if (cod == 1){
            valorItem = 4.00;
        }
        else if (cod == 2){
            valorItem = 4.50;
        }
        else if (cod == 3){
            valorItem = 5.00;
        }
        else if (cod == 4){
            valorItem = 2.00;
        }
        else{
            valorItem = 1.50;
        }

        total = valorItem * qtd;
        System.out.printf("Total: R$ %.2f\n", total);
    
    }
}