package decorator;

public class CamadaCor extends CamadaDecorator {
    public CamadaCor(Desenho d) {
        super(d);
    }
       
    @Override
    public void renderizar() {
        super.renderizar();
        adicionarCor();
    }

    private void adicionarCor() {
        System.out.println("Adicionando camada de cor.");
    }
}
