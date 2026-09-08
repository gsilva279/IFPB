package ProjetoVinteUm;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Baralho baralho = new Baralho();

        Mao jogador = new Mao();
        Mao computador = new Mao();

        // Jogador recebe duas cartas
        jogador.addCarta(baralho.puxarCarta());
        jogador.addCarta(baralho.puxarCarta());

        System.out.println("Sua mão:");
        System.out.println(jogador);

        // Computador recebe duas cartas
        computador.addCarta(baralho.puxarCarta());
        computador.addCarta(baralho.puxarCarta());

        System.out.println("\nPrimeira carta do computador:");
        System.out.println(computador);

        // O computador recebe duas cartas, mas mostramos
        // somente a primeira
        System.out.println("\nCarta visível do computador: "
                + computador.getCarta(0));

        int opcao;

        // Turno do jogador
        do {

            System.out.println("\nO que você deseja fazer?");
            System.out.println("1 - Puxar uma nova carta");
            System.out.println("2 - Encerrar o jogo");

            opcao = entrada.nextInt();

            if (opcao == 1) {

                jogador.addCarta(baralho.puxarCarta());

                System.out.println("\nSua mão:");
                System.out.println(jogador);

                if (jogador.totalDePontosAtual() > 21) {
                    System.out.println("\nVocê ultrapassou 21 pontos!");
                    System.out.println("Você perdeu!");

                    entrada.close();
                    return;
                }

            } else if (opcao == 2) {

                System.out.println("\nVocê encerrou o jogo.");
                
            } else {

                System.out.println("\nOpção inválida.");

            }

        } while (opcao != 2);

        // Revela o computador
        System.out.println("\n--- Mão do computador ---");
        System.out.println(computador);

        // Verifica se o computador já venceu
        if (computador.totalDePontosAtual() > 21) {

            System.out.println("\nO computador ultrapassou 21.");
            System.out.println("Você venceu!");

            entrada.close();
            return;
        }

        // Computador compra enquanto tiver menos pontos
        // que o jogador e não ultrapassar 21
        while (computador.totalDePontosAtual()
                < jogador.totalDePontosAtual()) {

            computador.addCarta(baralho.puxarCarta());

            System.out.println("\nComputador puxou uma carta.");
            System.out.println(computador);

            if (computador.totalDePontosAtual() > 21) {

                System.out.println("\nO computador ultrapassou 21.");
                System.out.println("Você venceu!");

                entrada.close();
                return;
            }
        }

        // Resultado final
        int pontosJogador = jogador.totalDePontosAtual();
        int pontosComputador = computador.totalDePontosAtual();

        System.out.println("\n--- Resultado final ---");
        System.out.println("Você: " + pontosJogador + " pontos");
        System.out.println("Computador: " + pontosComputador + " pontos");

        if (pontosJogador > pontosComputador) {
            System.out.println("Você venceu!");
        } else if (pontosComputador > pontosJogador) {
            System.out.println("O computador venceu!");
        } else {
            System.out.println("Empate!");
        }

        entrada.close();
    }
}
