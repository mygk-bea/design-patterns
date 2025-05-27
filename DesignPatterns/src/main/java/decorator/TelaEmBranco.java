package decorator;

public class TelaEmBranco implements Desenho {
    @Override
    public void renderizar() {
        System.out.println("Tela em branco.");
    }
    
    /* ERRADO:
    private boolean hasDesenho;
    private boolean hasColoracao;
    private boolean hasSombras;    
    private boolean hasIluminacao;

    public TelaEmBranco(boolean hasDesenho, boolean hasColoracao, boolean hasSombras, boolean hasIluminacao) {
        this.hasDesenho = hasDesenho;
        this.hasColoracao = hasColoracao;
        this.hasSombras = hasSombras;
        this.hasIluminacao = hasIluminacao;
    }
    
    @Override
    public void renderizar() {
        System.out.println("Tela em branco.");
        
        if(hasDesenho) {
            System.out.println("Adicionando camada de lineart.");
        }
        if(hasColoracao) {
            System.out.println("Adicionando camada de cor.");
        }
        if(hasSombras) {
            System.out.println("Adicionando camada de sombra.");
        }
        if(hasIluminacao) {
            System.out.println("Adicionando camada de iluminacao.");
        }
    }*/
}
