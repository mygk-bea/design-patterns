package grasp_avaliacao;

public class Main {
    public static void main(String[] args) {
        Item bigMac = new Item("Big Mac", 25.00, true);
        Item mcChicken = new Item("McChicken", 22.00, true);
        Item cheddarMcMelt = new Item("Cheddar McMelt", 20.00, true);
        Item batataFrita = new Item("Batata Frita", 10.00, false);
        Item refrigerante = new Item("Refrigerante", 8.00, false);

        System.out.println("--- Pedido sem desconto ---");
        Carrinho carrinho1 = new Carrinho();
        carrinho1.adicionarItem(bigMac, 2);
        carrinho1.adicionarItem(cheddarMcMelt, 2);
        carrinho1.adicionarItem(batataFrita, 1);
        carrinho1.adicionarItem(refrigerante, 1);

        Pedido pedido1 = new Pedido(carrinho1);
        double totalPedido1 = pedido1.calcularTotalComDesconto();
        System.out.printf("Valor final do Pedido 1: R$%.2f\n\n", totalPedido1);

        System.out.println("--- Pedido com desconto ---");
        Carrinho carrinho2 = new Carrinho();
        carrinho2.adicionarItem(bigMac, 2);
        carrinho2.adicionarItem(mcChicken, 3);
        carrinho2.adicionarItem(batataFrita, 5);
        carrinho2.adicionarItem(refrigerante, 5);
        
        Pedido pedido2 = new Pedido(carrinho2);
        double totalPedido2 = pedido2.calcularTotalComDesconto();
        System.out.printf("Valor final do Pedido 2: R$%.2f\n", totalPedido2);
    }
}