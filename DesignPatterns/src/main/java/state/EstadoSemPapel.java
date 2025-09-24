package state;

class EstadoSemPapel implements EstadoImpressora {
    @Override
    public void imprimirDocumento(Impressora impressora, String doc) {
        System.out.println("Erro: sem papel para imprimir " + doc);
    }
}