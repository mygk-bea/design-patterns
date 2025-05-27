package decorator;

public class Main {
    public static void main(String[] args) {
        Desenho desenho = new TelaEmBranco();
        // ERRADO: Desenho desenho = new TelaEmBranco(true, true, true, true);
        
        desenho = new CamadaLinha(desenho);
        desenho = new CamadaCor(desenho);
        desenho = new CamadaSombra(desenho);
        desenho = new CamadaBrilho(desenho);
        
        desenho.renderizar();
    }
}
