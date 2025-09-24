package state;

class Impressora {
    private EstadoImpressora estado;
    // ERRADO: private String estado;

    public Impressora() {
        this.estado = new EstadoPronta();
        // ERRADO:  this.estado = "PRONTA";
    }

    public void setEstado(EstadoImpressora estado) {
        this.estado = estado;
    }

    public void imprimirDocumento(String doc) {
        estado.imprimirDocumento(this, doc);
    }
    
    /* ERRADO:
    public void imprimirDocumento(String doc) {
        switch (estado) {
            case "PRONTA":
                System.out.println("Imprimindo: " + doc);
                this.estado = "IMPRIMINDO";
                break;
            case "IMPRIMINDO":
                System.out.println("Documento enfileirado: " + doc);
                break;
            case "SEM_PAPEL":
                System.out.println("Erro: sem papel para imprimir " + doc);
                break;
            case "TRAVADA":
                System.out.println("Erro: impressora travada, reinicie.");
                break;
            default:
                System.out.println("Estado desconhecido.");
        }
    }*/
}
