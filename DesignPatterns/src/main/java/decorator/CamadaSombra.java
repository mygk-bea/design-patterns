package decorator;

public class CamadaSombra extends CamadaDecorator {
    public CamadaSombra(Desenho d) {
        super(d);
    }
       
    @Override
    public void renderizar() {
        super.renderizar();
        adicionarSombra();
    }

    private void adicionarSombra() {
        System.out.println("Adicionando camada de sombra.");
    }
}
