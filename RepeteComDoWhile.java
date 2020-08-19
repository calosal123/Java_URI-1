import java.util.Scanner;
public class RepeteComDoWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);


        // int valor=100;
        // do{
        //     System.out.println("Valor = "+valor);
        //     valor = valor + 1;
        // } while(valor <= 10);

        int opcao;
        do{
            System.out.println("Digite 1-Deposito/2-Saque/3-Extrato/0-Encerrar");
            opcao = teclado.nextInt();
            System.out.println("Digitou a opcao = "+opcao);
        } while (opcao != 0);
    }
}