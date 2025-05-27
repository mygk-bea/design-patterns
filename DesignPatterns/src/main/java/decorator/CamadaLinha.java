package decorator;

public class CamadaLinha extends CamadaDecorator {
    public CamadaLinha(Desenho d) {
        super(d);
    }
    
    @Override
    public void renderizar() {
        super.renderizar();
        adicionarLinha();
    }

    private void adicionarLinha() {
        System.out.println("Adicionando camada de lineart.");
    }
}
