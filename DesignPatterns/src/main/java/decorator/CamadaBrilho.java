package decorator;

public class CamadaBrilho extends CamadaDecorator {
    public CamadaBrilho(Desenho d) {
        super(d);
    }
       
    @Override
    public void renderizar() {
        super.renderizar();
        adicionarBrilho();
    }

    private void adicionarBrilho() {
        System.out.println("Adicionando camada de iluminacao.");
    }
}
