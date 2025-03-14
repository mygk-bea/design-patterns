package solid;

/*
* Código completo RESPEITANDO os princípios SOLID
*/

public class Pedido {
    private String cliente;
    private double valor;
    private Desconto desconto;
    private EmailService emailService;

    public Pedido(String cliente, double valor, Desconto desconto, EmailService emailService) {
        this.cliente = cliente;
        this.valor = valor;
        this.desconto = desconto;
        this.emailService = emailService;
    }

    public String gerarResumo() {
        double descontoCalculado = desconto.calcularDesconto(valor);
        return "Cliente: " + cliente + ", Valor: " + valor + ", Desconto: " + descontoCalculado;
    }

    public void enviaEmail() {
        emailService.enviaEmail(cliente);
    }
}
