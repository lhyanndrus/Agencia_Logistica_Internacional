import br.com.agencia.aeroportos.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        System.out.println("=================================================");
        System.out.println("    SISTEMA DE LOGÍSTICA DE VÔOS INTERNACIONAIS  ");
        System.out.println("=================================================");

        while (executando) {
            System.out.println("\nDigite o código IATA de 3 letras do aeroporto de destino (ex: JFK, CDG, HND) ou 'sair':");
            System.out.print("Destino (IATA): ");
            String codigo = scanner.next();

            if (codigo.equalsIgnoreCase("sair")) {
                executando = false;
                System.out.println("\nPainel de logística encerrado.");
                break;
            }

            // Busca o destino dinamicamente via Reflection
            Aeroporto destino = AeroportoFactory.obterAeroporto(codigo);

            if (destino != null) {
                System.out.print("Digite a quantidade de passageiros: ");
                int passageiros = scanner.nextInt();
                if (passageiros <= 0) passageiros = 1;

                System.out.println("\n-------------------------------------------------");
                System.out.println("🛫 PLANO DE VÔO INTERNACIONAL (Saindo de GRU/SP)");
                System.out.println("Aeroporto de Chegada: " + destino.obterNomeAeroporto());

                // Cálculo do tempo em horas e minutos
                int totalMinutos = destino.obterTempoVooMinutos();
                int horas = totalMinutos / 60;
                int minutos = totalMinutos % 60;
                System.out.printf("Duração Estimada do Vôo: %dh %dmin\n", horas, minutos);

                // Cálculo financeiro
                double precoTotal = destino.calcularPrecoVoo(passageiros);
                System.out.printf("Orçamento Total (%d pass.): R$ %.2f\n", passageiros, precoTotal);
                System.out.println("-------------------------------------------------");
            } else {
                System.out.println("\n[AVISO]: Aeroporto sem rotas ativas ou classe não integrada via Git!");
            }
        }
        scanner.close();
    }
}