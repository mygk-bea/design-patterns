package grasp;

public class Batalha {
    private Heroi heroi;
    private Inimigo inimigo;
    private boolean turnoHeroi = true;

    public Batalha(Heroi heroi, Inimigo inimigo) {
        this.heroi = heroi;
        this.inimigo = inimigo;
    }

    public void batalhar() {
        while (heroi.estaVivo() && inimigo.estaVivo()) {
            if (turnoHeroi) {
                heroi.atacar(inimigo);
            } else {
                inimigo.atacar(heroi);
            }
            trocarTurno();
        }

        if (heroi.estaVivo()) {
            System.out.println("Heroi venceu!");
        } else {
            System.out.println("Inimigo venceu!");
        }
    }

    public void trocarTurno() {
        turnoHeroi = !turnoHeroi;
    }
}
