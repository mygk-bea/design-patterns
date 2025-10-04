package grasp;

public class JogoController {
    private Jogo jogo;

    public JogoController(Jogo jogo) {
        this.jogo = jogo;
    }

    public void mostrarMenu() {
        System.out.println("=== MENU DO JOGO ===");
        System.out.println("1. Iniciar");
        System.out.println("2. Sair");
    }
}