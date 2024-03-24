import java.util.Scanner;

public class Exercicio12 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("qual o número do mês: ");
        int numeroMes = scanner.nextInt();
        
        String[] nomesMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        if (numeroMes >= 1 && numeroMes <= 12) {
            System.out.println("O mês correspondente é: " + nomesMeses[numeroMes - 1]);
        } else {
            System.out.println("Mês inválido!");
        }
    }

}
