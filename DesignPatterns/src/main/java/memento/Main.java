package memento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogador jogador = new Jogador();
        Historico historico = new Historico();
        boolean rodando = true;

        System.out.println("=== Bem-vindo ao jogo Memento ===");

        while (rodando) {
            System.out.println("\nEscolha uma acao:");
            System.out.println("1. Atacar | 2. Salvar | 3. Carregar | 4. Sair");
            System.out.print("> ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    jogador.atacar();
                    jogador.status();
                    if (jogador.isMorto()) {
                        System.out.println("Deseja voltar ao ultimo checkpoint? (s/n)");
                        String resp = scanner.nextLine();
                        if (resp.equalsIgnoreCase("s")) {
                            Memento m = historico.ultimoSave();
                            if (m != null) {
                                jogador.restaurar(m);
                            } else {
                                System.out.println("Nenhum checkpoint encontrado. Reiniciando jogo...");
                                jogador.reset();
                            }
                            jogador.status();
                        } else {
                            System.out.println("Você continua morto. Fim do jogo.");
                            rodando = false;
                        }
                    }
                    break;

                case "2":
                    historico.adicionarSave(jogador.salvar());
                    break;

                case "3":
                    if (!historico.temSaves()) {
                        System.out.println("Nenhum checkpoint disponivel.");
                    } else {
                        System.out.println("Escolha um checkpoint para carregar:");
                        historico.listarSaves();
                        System.out.print("> ");
                        try {
                            int escolha = Integer.parseInt(scanner.nextLine());
                            Memento m = historico.escolherSave(escolha);
                            if (m != null) {
                                jogador.restaurar(m);
                                jogador.status();
                            } else {
                                System.out.println("Escolha invalida.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada invalida.");
                        }
                    }
                    break;

                case "4":
                    System.out.println("Saindo do jogo...");
                    rodando = false;
                    break;

                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        }
        scanner.close();
        System.out.println("=== Fim do jogo ===");
    }
}
