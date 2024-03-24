import java.util.Scanner;

public class Exercicio3 {

    public static void executar () {

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero = entrada.nextInt();
        System.out.println("digite outro numero");
        int numero2 = entrada.nextInt();

        if (numero>numero2){
            System.out.println("Primeiro numero é o maior");
        } else if (numero2>numero){
            System.out.println("Segundo numero é o maior");
        } else if (numero2 == numero){
            System.out.println("Numeros iguais");
        }

    }

}