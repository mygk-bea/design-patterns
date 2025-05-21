package composite;

import java.util.ArrayList;
import java.util.List;

public class C_Estante implements ItemBiblioteca { 
    // ERRADO: NAO UTILIZA O OVERRIDE POR NAO IMPLEMENTAR A INTERFACE ItemBiblioteca
    
    private String identificador;
    private List<ItemBiblioteca> itens = new ArrayList<>();
    // ERRADO: private List<Livro> livros = new ArrayList<>();

    public C_Estante(String identificador) {
        this.identificador = identificador;
    }

    public void adicionar(ItemBiblioteca item) {
        itens.add(item);
    }
    // ERRADO: public void adicionarLivro(Livro livro) {...}

    @Override
    public void exibirInformacoes(String prefixo) {
        System.out.println(prefixo + "Estante: " + identificador);
        for (ItemBiblioteca item : itens) {
            item.exibirInformacoes(prefixo + "  ");
        }
    }
    /* ERRADO:
    public void exibirInformacoes(String prefixo) {
        System.out.println(prefixo + "Estante: " + identificador);
        for (Livro livro : livros) {
            livro.exibirInformacoes(prefixo + "  ");
        }
    }*/

    @Override
    public int contarItens() {
        int total = 0;
        for (ItemBiblioteca item : itens) {
            total += item.contarItens();
        }
        return total;
    }
    /* ERRADO:
    public int contarLivros() {
        return livros.size();
    }*/ 
}