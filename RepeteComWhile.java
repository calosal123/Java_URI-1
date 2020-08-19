import java.util.Scanner;
public class RepeteComWhile{
    public static void main(String args[]){

        // int valor = 100;

        // while (valor < 10){
        //     System.out.println("Valor = "+valor);
        //     valor  = valor + 1;
        // }

        Scanner teclado = new Scanner(System.in);
        int codProduto=0;

        while(codProduto != -1){
            System.out.print("Digite um código de produto:");
            codProduto = teclado.nextInt();
            System.out.println("  ---> O Codigo digitado foi : "+codProduto);
        }

    }
}