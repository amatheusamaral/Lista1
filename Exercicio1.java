import java.util.Scanner;

public class Exercicio1 {

    public static void executar () {

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero = entrada.nextInt();

        if (numero > 10) {
            System.out.println("numero maior que 10");
        } else if (numero < 10) {
            System.out.println("numero menor que 10");

        }
        

    }

}
