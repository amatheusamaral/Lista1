import java.util.Scanner;

public class Exercicio20 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tempo da viagem em horas: ");
        double tempoViagem = scanner.nextDouble();
        
        System.out.print("Digite a velocidade média da viagem em km/h: ");
        double velocidadeMedia = scanner.nextDouble();
        
        double distancia = tempoViagem * velocidadeMedia;
        double litrosConsumidos = distancia / 12;
        
        System.out.println("A quantidade de litros de combustível gasta é: " + litrosConsumidos);
    }

}
