package proxy;

import java.util.HashMap;
import java.util.Map;

public class CaixaForteErrado implements Cofre{
    private Map<String, String> users = new HashMap<>();
    
    public CaixaForteErrado() {
        users.put("Rogerio", "12345");
        users.put("Roberta", "senha");
    }
    
    @Override
    public void abrir(String credenciaisUser, String senha) {
        if (users.containsKey(credenciaisUser)) {
            String senhaCorreta = users.get(credenciaisUser);
            if (senhaCorreta.equals(senha)) {
                System.out.println("Cofre aberto para " + credenciaisUser + "!");
            } else {
                System.out.println("Senha incorreta para " + credenciaisUser + ".");
            }
        } else {
            System.out.println("Usuario nao autorizado: " + credenciaisUser + ".");
        }
    }
}
