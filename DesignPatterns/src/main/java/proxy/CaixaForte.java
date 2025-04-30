package proxy;

public class CaixaForte implements Cofre {
    @Override
    public void abrir(String credenciaisUser, String senha) {
        System.out.println("Cofre aberto para " + credenciaisUser + "!");
    }
}
