import java.util.Scanner;

public class Exercicio2 {

    public static void executar() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero = entrada.nextInt();
        System.out.println("digite outro numero");
        int numero2 = entrada.nextInt();

        int resultado = numero + numero2;

        System.out.println("resultado: " + resultado);

    }

}
