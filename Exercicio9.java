import java.util.Scanner;

public class Exercicio9 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite dois números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (a == b) {
            System.out.println("números são iguais.");
        } else {
            System.out.println("números diferentes. O maior número é: " + Math.max(a, b));
        }
    }

}
