package grasp_avaliacao;

class Pedido {
    private Carrinho carrinho;

    public Pedido(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public double calcularTotalComDesconto() {
        double subtotal = carrinho.calcularSubtotal();
        int quantidadeDeLanches = carrinho.getTotalDeLanches();

        System.out.printf("Subtotal do carrinho: R$%.2f\n", subtotal);
        
        if (quantidadeDeLanches >= 5) {
            System.out.println("Desconto de 10% aplicado! (Total de lanches: " + quantidadeDeLanches + ")");
            return subtotal * 0.90;
        } else {
            System.out.println("Nenhum desconto aplicado. (Total de lanches: " + quantidadeDeLanches + ")");
            return subtotal;
        }
    }
}