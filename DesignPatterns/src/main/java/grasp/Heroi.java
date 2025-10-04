package grasp;

import java.util.ArrayList;
import java.util.List;

public class Heroi extends Personagem {
    private int pontosExperiencia;
    private List<Item> itens;

    public Heroi(String nome) {
        super(nome, 1, 100);
        this.itens = new ArrayList<>();
        this.pontosExperiencia = 0;
    }

    public void setPontosExperiencia(int pontosExperiencia) {
        this.pontosExperiencia = pontosExperiencia;
    }

    public int getPontosExperiencia() {
        return pontosExperiencia;
    }

    @Override
    public int calcularDano() {
        return 10 + nivel;
    }

    public void atacar(Personagem inimigo) {
        int dano = calcularDano();
        inimigo.receberDano(dano);
    }

    public void coletarItem(Item item) {
        itens.add(item);
        System.out.println(nome + " coletou " + item.getNome());
    }

    public void descartarItem(Item item) {
        itens.remove(item);
        System.out.println(nome + " descartou " + item.getNome());
    }

    public void explorar(Territorio territorio) {
        System.out.println(nome + " esta explorando " + territorio.getNome());
    }

    public void aumentarNivel() {
        nivel++;
        pontosExperiencia = 0;
        System.out.println(nome + " subiu para o nivel " + nivel + "!");
    }
}