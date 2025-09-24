package state;

class EstadoImprimindo implements EstadoImpressora {
    @Override
    public void imprimirDocumento(Impressora impressora, String doc) {
        System.out.println("Documento enfileirado: " + doc);
    }
}