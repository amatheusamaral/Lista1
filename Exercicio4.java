import java.util.Scanner;

public class Exercicio4 {

    public static void executar() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero = entrada.nextInt();
        System.out.println("digite outro numero");
        int numero2 = entrada.nextInt();

        int soma = numero + numero2;
        int subtracao = numero - numero2;
        int multiplicacao = numero * numero2;
        int divisao = numero / numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

    }

}
