package solid;

/*
* Código completo VIOLANDO os princípios SOLID
*/

public class PedidoErrado {
    String cliente;
    double valor;
    double desconto;

    PedidoErrado(String cliente, double valor) {
        this(cliente, valor, 0.0);
    }

    PedidoErrado(String cliente, double valor, double desconto) {
        this.cliente = cliente;
        this.valor = valor;
        this.desconto = desconto;
    }

    void calcularDesconto() {
        if (valor == 100) {
            desconto = valor * 0.1;
        } else {
            desconto = 0;
        }
        System.out.println("Desconto calculado: " + desconto);
    }

    void gerarRelatorio() {
        System.out.println("Relatorio de pedido: " + cliente + ", R$ " + valor);
    }

    void alterarValor(double novoValor) {
        valor = novoValor;
    }

    void enviarEmail() {
        System.out.println("Enviando e-mail para " + cliente + "...");
    }

    void salvarPedido() {
        System.out.println("Pedido de " + cliente + " no valor de " + valor + " foi salvo no banco de dados.");
    }
}
