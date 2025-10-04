package grasp;

public class Inimigo extends Personagem {
    public Inimigo(String nome, int nivel, int vida) {
        super(nome, nivel, vida);
    }

    @Override
    public int calcularDano() {
        return 5 + nivel;
    }

    public void atacar(Personagem alvo) {
        int dano = calcularDano();
        alvo.receberDano(dano);
    }
}