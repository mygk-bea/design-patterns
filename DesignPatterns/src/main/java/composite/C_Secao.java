package composite;

import java.util.ArrayList;
import java.util.List;

public class C_Secao implements ItemBiblioteca {
    // ERRADO: NAO UTILIZA O OVERRIDE POR NAO IMPLEMENTAR A INTERFACE ItemBiblioteca
    
    private String nome;
    private List<ItemBiblioteca> estantes = new ArrayList<>();

    public C_Secao(String nome) {
        this.nome = nome;
    }

    public void adicionar(ItemBiblioteca estante) {
        estantes.add(estante);
    }
    // ERRADO: public void adicionarEstante(C_Estante estante) {...}

    @Override
    public void exibirInformacoes(String prefixo) {
        System.out.println(prefixo + "Secao: " + nome);
        for (ItemBiblioteca estante : estantes) {
            estante.exibirInformacoes(prefixo + "  ");
        }
    }

    @Override
    public int contarItens() {
        int total = 0;
        for (ItemBiblioteca estante : estantes) {
            total += estante.contarItens();
        }
        return total;
    }
}