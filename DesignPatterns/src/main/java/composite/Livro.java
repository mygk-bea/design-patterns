package composite;

public class Livro implements ItemBiblioteca {
    // ERRADO: NAO UTILIZA O OVERRIDE POR NAO IMPLEMENTAR A INTERFACE ItemBiblioteca
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public void exibirInformacoes(String prefixo) {
        System.out.println(prefixo + "Livro: \"" + titulo + "\" por " + autor);
    }

    @Override
    public int contarItens() {
        return 1;
    }
}