package solid;

/*
* Código completo VIOLANDO os princípios SOLID
*/

public class MainErrado {
    public static void main(String[] args) {    
        PedidoErrado pedido = new PedidoErrado("Joao", 120);
        pedido.calcularDesconto();
        pedido.gerarRelatorio();
        pedido.alterarValor(150);
        pedido.enviarEmail();
        pedido.salvarPedido();
    }
}
