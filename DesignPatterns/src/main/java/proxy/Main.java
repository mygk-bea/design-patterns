package proxy;

public class Main {
    public static void main(String[] args) {
        Cofre cofreBanco = new ProxyCofre();
        //Cofre cofreBanco = new CaixaForteErrado();

        cofreBanco.abrir("Roberta", "senha");
        cofreBanco.abrir("Rogerio", "54321");
        cofreBanco.abrir("Estranho", "0000");
    }
}
