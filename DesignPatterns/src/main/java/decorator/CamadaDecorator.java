package decorator;

public class CamadaDecorator implements Desenho {
    protected Desenho desenho;
    
    public CamadaDecorator(Desenho d) {
        this.desenho = d;
    }
    
    @Override
    public void renderizar() {
        desenho.renderizar();
    }
}
