package grasp;

public class Main {
    public static void main(String[] args) {
        Heroi heroi = new Heroi("Arthas");

        Jogo jogo = new Jogo(heroi);
        JogoController controller = new JogoController(jogo);

        controller.mostrarMenu();
        jogo.iniciar();

        Territorio floresta = new Territorio("Floresta Sombria");

        Inimigo goblin = new Inimigo("Goblin", 1, 50);
        floresta.adicionarInimigo(goblin);

        PocaoCura pocao = new PocaoCura();
        floresta.adicionarItem(pocao);

        jogo.adicionarTerritorio(floresta);
        heroi.explorar(floresta);

        System.out.println("\n--- BATALHA INICIADA ---");
        Batalha batalha = new Batalha(heroi, goblin);
        batalha.batalhar();

        if (heroi.estaVivo()) {
            System.out.println("\nHeroi encontrou uma pocao...");
            heroi.coletarItem(pocao);
            pocao.usar(heroi);
        }

        jogo.sair();
    }
}