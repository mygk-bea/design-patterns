package grasp;

public abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected int vida;

    public Personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public abstract int calcularDano();

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida atual: " + vida);
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
