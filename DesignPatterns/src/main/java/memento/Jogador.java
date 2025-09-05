package memento;

class Jogador {
    private int vida;
    private int experiencia;

    public Jogador() {
        reset();
    }

    public void reset() {
        vida = 100;
        experiencia = 0;
    }

    public void status() {
        System.out.println("[Vida: " + vida + ", Experiencia: " + experiencia + "]");
    }

    public void atacar() {
        System.out.println("-> Voce entrou em batalha!");
        vida -= 30;
        experiencia += 20;
        if (vida <= 0) {
            System.out.println("-> Sua vida chegou a 0!");
        } else {
            System.out.println("-> Voce sobreviveu a batalha!");
        }
    }

    public Memento salvar() {
        return new Memento(vida, experiencia);
    }

    public void restaurar(Memento memento) {
        if (memento != null) {
            this.vida = memento.getVida();
            this.experiencia = memento.getExperiencia();
            System.out.println("-> Status restaurado!");
        }
    }

    public boolean isMorto() {
        return vida <= 0;
    }
}