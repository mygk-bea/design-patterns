package command;

public class Elevador {
    private int andarAtual = 0;
    
    public void irParaAndar(int andar) {
        System.out.println("Andar atual: " + andarAtual + " Indo para: " + andar);
        andarAtual = andar;
    }
}
