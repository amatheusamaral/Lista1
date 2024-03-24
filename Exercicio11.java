import java.util.Scanner;

public class Exercicio11 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite três números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("Os números em ordem crescente são: " + num1 + ", " + num2 + ", " + num3);
    }

}
