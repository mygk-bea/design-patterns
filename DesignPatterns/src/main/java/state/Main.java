package state;

public class Main {
    public static void main(String[] args) {
        Impressora imp = new Impressora();

        imp.imprimirDocumento("Relatorio 1");
        
        imp.setEstado(new EstadoSemPapel());
        // ERRADO: imp.setEstado("SEM_PAPEL");
        imp.imprimirDocumento("Relatorio 2");
        
        imp.setEstado(new EstadoTravada());
        // ERRADO: imp.setEstado("TRAVADA");
        imp.imprimirDocumento("Relatorio 2");
        
        imp.setEstado(new EstadoPronta());
        imp.imprimirDocumento("Relatorio 2");
        
        imp.setEstado(new EstadoImprimindo());
        imp.imprimirDocumento("Relatorio 3");

    }
}
