package grasp_avaliacao;

import java.util.ArrayList;
import java.util.List;

class Carrinho {
    private static class ItemCarrinho {
        private Item item;
        private int quantidade;

        public ItemCarrinho(Item item, int quantidade) {
            this.item = item;
            this.quantidade = quantidade;
        }

        public Item getItem() { return item; }
        public int getQuantidade() { return quantidade; }
        public double getSubtotal() { return item.getPrecoUnitario() * quantidade; }
    }

    private List<ItemCarrinho> itensNoCarrinho;

    public Carrinho() {
        this.itensNoCarrinho = new ArrayList<>();
    }

    public void adicionarItem(Item item, int quantidade) {
        this.itensNoCarrinho.add(new ItemCarrinho(item, quantidade));
    }
    
    public double calcularSubtotal() {
        double subtotal = 0.0;
        for (ItemCarrinho itemCarrinho : itensNoCarrinho) {
            subtotal += itemCarrinho.getSubtotal();
        }
        return subtotal;
    }

    public int getTotalDeLanches() {
        int totalLanches = 0;
        for (ItemCarrinho itemCarrinho : itensNoCarrinho) {
            if (itemCarrinho.getItem().ehLanche()) {
                totalLanches += itemCarrinho.getQuantidade();
            }
        }
        return totalLanches;
    }
}