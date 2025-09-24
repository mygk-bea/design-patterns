package state;

class EstadoTravada implements EstadoImpressora {
    @Override
    public void imprimirDocumento(Impressora impressora, String doc) {
        System.out.println("Erro: impressora travada, reinicie.");
    }
}