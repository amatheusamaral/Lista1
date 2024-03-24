import java.util.Scanner;

public class Exercicio6 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("qual a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("temperatura em Fahrenheit é: " + fahrenheit);
    }

}
