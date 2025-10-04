package grasp;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private List<Territorio> mapa;
    private Heroi heroi;

    public Jogo(Heroi heroi) {
        this.mapa = new ArrayList<>();
        this.heroi = heroi;
    }

    public void iniciar() {
        System.out.println("Jogo iniciado!");
    }

    public void sair() {
        System.out.println("Saindo do jogo...");
    }

    public void adicionarTerritorio(Territorio t) {
        mapa.add(t);
    }
}
