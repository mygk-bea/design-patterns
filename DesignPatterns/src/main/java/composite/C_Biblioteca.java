package composite;

import java.util.ArrayList;
import java.util.List;

public class C_Biblioteca implements ItemBiblioteca { 
    // ERRADO: NAO UTILIZA O OVERRIDE POR NAO IMPLEMENTAR A INTERFACE ItemBiblioteca
    
    private String nome;
    private List<ItemBiblioteca> secoes = new ArrayList<>();
    // ERRADO: private List<C_Secao> secoes = new ArrayList<>();
    
    public C_Biblioteca(String nome) {
        this.nome = nome;
    }

    public void adicionar(ItemBiblioteca secao) {
        secoes.add(secao);
    }
    // ERRADO: public void adicionarSecao(C_Secao secao) {...}

    @Override
    public void exibirInformacoes(String prefixo) {
        System.out.println(prefixo + "Biblioteca: " + nome);
        for (ItemBiblioteca secao : secoes) {
            secao.exibirInformacoes(prefixo + "  ");
        }
    }
    /* ERRADO:
    public void exibirInformacoes(String prefixo) {
        System.out.println(prefixo + "Biblioteca: " + nome);
        for (C_Secao secao : secoes) {
            secao.exibirInformacoes(prefixo + "  ");
        }
    }*/

    @Override
    public int contarItens() {
        int total = 0;
        for (ItemBiblioteca secao : secoes) {
            total += secao.contarItens();
        }
        return total;
    }
    /* ERRADO:
    public int contarLivros() {
        int total = 0;
        for (C_Secao secao : secoes) {
            total += secao.contarLivros();
        }
        return total;
    }*/
}