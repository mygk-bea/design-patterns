package prototype;

public abstract class BonecoLego implements Cloneable{
    private final String cor = "amarelo";
    private final String bracos = "lego";
    private final String pernas = "lego";
    private final String formatoCabeca = "lego";
    protected String formatoCorpo = "padrao";
    protected String genero = "masculino";
    protected String rosto = "serio";
    protected String roupa;
    protected String acessorios;
    
    public BonecoLego() {}
    
    public void setFomatoCorpo(String corpo) {
        this.formatoCorpo = corpo;
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
            this.formatoCorpo = "triangulo";
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
    
    @Override
    public abstract BonecoLego clone();
}
