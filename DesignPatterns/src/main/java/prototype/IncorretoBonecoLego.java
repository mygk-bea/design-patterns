package prototype;

public abstract class IncorretoBonecoLego{
    private final String cor = "amarelo";
    private final String bracos = "lego";
    private final String pernas = "lego";
    private final String formatoCabeca = "lego";
    private String formatoCorpo = "padrao";
    protected String genero;
    protected String rosto;
    protected String roupa;
    protected String acessorios;
    
    public IncorretoBonecoLego(String genero, String roupa, String acessorios) {
        this.genero = genero;
        this.formatoCorpo = (genero.equals("feminino")) ? "triangulo" : "padrao";
        this.roupa = roupa;
        this.acessorios = acessorios;
        this.rosto = "serio";
    }
    
    public void setRosto(String rosto) {
        this.rosto = rosto;
    }
    
    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
        if(genero.equals("feminino")) {
            this.formatoCorpo = "vestido";
        }
    }    
    
    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }
    
    public void verPadrao() {
        System.out.println("=== INFOS BASICAS ===");
        System.out.println("|-> Cor: " + cor);
        System.out.println("|-> Bracos: " + bracos);
        System.out.println("|-> Pernas: " + pernas);
        System.out.println("|-> Cabeca: " + formatoCabeca);
        System.out.println("=====================");
    }
    
    public void ver() {
        System.out.println("|-> Corpo: " + formatoCorpo);
        System.out.println("|-> Expressao: " + rosto);
        System.out.println("|-> Roupa: " + roupa);
        System.out.println("|-> Acessorios: " + acessorios);
    }
}
