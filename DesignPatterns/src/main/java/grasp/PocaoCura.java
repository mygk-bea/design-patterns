package grasp;

public class PocaoCura extends Item {

    public PocaoCura() {
        super("Pocao de Cura", "Cura");
    }

    @Override
    public void usar(Heroi alvo) {
        System.out.println(alvo.nome + " usou Pocao de Cura! Vida restaurada.");
        alvo.setVida(100);
        alvo.descartarItem(this);
    }
}