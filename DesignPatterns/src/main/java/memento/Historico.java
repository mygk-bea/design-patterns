package memento;
import java.util.ArrayList;
import java.util.List;

class Historico {
    private List<Memento> saves = new ArrayList<>();

    public void adicionarSave(Memento memento) {
        saves.add(memento);
        System.out.println("-> Checkpoint salvo!");
    }

    public boolean temSaves() {
        return !saves.isEmpty();
    }

    public void listarSaves() {
        if (!temSaves()) {
            System.out.println("Nenhum checkpoint disponivel.");
            return;
        }
        for (int i = 0; i < saves.size(); i++) {
            System.out.println((i + 1) + ". Vida: " + saves.get(i).getVida()
                    + ", Exp: " + saves.get(i).getExperiencia());
        }
    }

    public Memento escolherSave(int indice) {
        if (indice < 1 || indice > saves.size()) return null;
        return saves.get(indice - 1);
    }

    public Memento ultimoSave() {
        if (!temSaves()) return null;
        return saves.get(saves.size() - 1);
    }
    
    /*ERRADO:
    public void salvar(Jogador jogador) {
        Jogador copia = new Jogador();
        copia.vida = jogador.vida;
        copia.experiencia = jogador.experiencia;
        saves.add(copia);
    }

    public Jogador carregar(int indice) {
        return saves.get(indice);
    }*/
}