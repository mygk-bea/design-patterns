package grasp;

public class Estrela extends Item {
    public Estrela() {
        super("Estrela", "Especial");
    }

    @Override
    public void usar(Heroi alvo) {
        System.out.println(alvo + " usou uma Estrela! Ganhou 50 pontos de experiencia.");
        alvo.setPontosExperiencia(50);
        alvo.descartarItem(this);
    }
}