import java.util.Scanner;

/*
  
  100 kw  -  salMinimo/7
   1  kw  -  x

   x * 100 = salMinimo/7 ==> x = salMinimo/700


*/
public class Exercicio3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salMinimo;
        float consumoKw;
        float valor1Kw;
        float valorConta;
        float valorDesconto;

        // entrada
        System.out.println("Digite o valor do salario Minimo");
        salMinimo = teclado.nextFloat();
        System.out.println("Digite o consumo em Kw da residencia");
        consumoKw = teclado.nextFloat();

        // processamento - determinar o valor de 1 kw e o valor da conta
        valor1Kw = salMinimo / 700.0f;
        valorConta = valor1Kw * consumoKw;
        valorDesconto = valorConta * (90 / 100);

        // saída no formato R$
        System.out.printf("Valor de 1 Kw R$ %.2f\n", valor1Kw);
        System.out.printf("Valor bruto   R$ %.2f\n", valorConta);
        System.out.printf("Valor c/ desc R$ %.2f\n", valorDesconto);

    }
}