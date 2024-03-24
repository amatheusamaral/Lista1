import java.util.Scanner;

public class Exercicio13 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("qual o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("qual o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = 0;
        switch (operador) {
            case '+':
                resultado = A + B;
                break;
            case '-':
                resultado = A - B;
                break;
            case '*':
                resultado = A * B;
                break;
            case '/':
                if (B != 0) {
                    resultado = A / B;
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Operador não definido!");
        }
        System.out.println("Resultado: " + resultado);
    }

}
