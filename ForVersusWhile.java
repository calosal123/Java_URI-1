public class ForVersusWhile{
    public static void main(String args[]){


        // vamos fazer um exemplo do contar até 10
        int cont=0;   /*(1)*/
        while (cont <=10  /* (2) */  ){
            if (cont == 5){
                cont++;
                continue;
            }
            System.out.println("cont = "+cont);
            cont++;  /*(3)*/
        }

        /*
        (1) - declaracao +  inicializacao
        (2) - condicao logica para continuar
        (3) - incremento
        */

        // for (int cont=0 ;cont <=10 ; cont++){
        //     if (cont == 5){
        //         continue;
        //     }
        //     System.out.println("cont = "+cont);
        // }
    }
}