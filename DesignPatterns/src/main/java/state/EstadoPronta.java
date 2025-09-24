package state;

class EstadoPronta implements EstadoImpressora {
    @Override
    public void imprimirDocumento(Impressora impressora, String doc) {
        System.out.println("Imprimindo: " + doc);
        impressora.setEstado(new EstadoImprimindo());
    }
}