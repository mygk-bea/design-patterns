package grasp;

import java.util.ArrayList;
import java.util.List;

public class Territorio {
    private String nome;
    private List<Inimigo> inimigos;
    private List<Item> itens;

    public Territorio(String nome) {
        this.nome = nome;
        this.inimigos = new ArrayList<>();
        this.itens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarInimigo(Inimigo inimigo) {
        inimigos.add(inimigo);
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }
}