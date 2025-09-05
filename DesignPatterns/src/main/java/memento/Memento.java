package memento;

class Memento {
    private final int vida;
    private final int experiencia;

    public Memento(int vida, int experiencia) {
        this.vida = vida;
        this.experiencia = experiencia;
    }

    public int getVida() {
        return vida;
    }

    public int getExperiencia() {
        return experiencia;
    }
}
