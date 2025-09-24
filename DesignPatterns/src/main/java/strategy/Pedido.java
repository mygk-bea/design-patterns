package strategy;

public class Pedido {
    double valorTotal;
    Cliente cliente;
    DescontoStrategy desconto;
    
    public Pedido(double valorTotal, Cliente cliente, DescontoStrategy desconto) {
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.desconto = desconto;
    }
    
    void finalizar_pedido() {
        System.out.println("Cliente: " + cliente.nome);
        double valorFinal = desconto.aplicar_desconto(valorTotal, cliente);
        System.out.println("Subtotal: R$ " + String.format("%.2f", valorTotal));
        System.out.println("Valor final: R$ " + String.format("%.2f", valorFinal) + "\n");
    }
}
