package proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyCofre implements Cofre {
    private CaixaForte cofre = new CaixaForte();
    
    private Map<String, String> users = new HashMap<>();

    public ProxyCofre() {
        users.put("Rogerio", "12345");
        users.put("Roberta", "senha");
    }

    @Override
    public void abrir(String credenciaisUser, String senha) {
        if (users.containsKey(credenciaisUser)) {
            String senhaCorreta = users.get(credenciaisUser);
            if (senhaCorreta.equals(senha)) {
                cofre.abrir(credenciaisUser, senha);
            } else {
                System.out.println("Senha incorreta para " + credenciaisUser + ".");
            }
        } else {
            System.out.println("Usuario nao autorizado: " + credenciaisUser + ".");
        }
    }
}
