package builder;

public class Programa {
    public static void main(String[] args) {
        ComputadorDiretor director = new ComputadorDiretor();
        
        Computador pcGamer = director.construir(new PCGamerBuilder());
        Computador notebook = new NotebookBuilder().build();
        
        System.out.println("|- Configuracoes: PC Gamer");
        System.out.println(pcGamer);
        System.out.println("\n\n|- Configuracoes: Notebook");
        System.out.println(notebook);
    }
}
