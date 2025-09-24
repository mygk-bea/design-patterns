package strategy;

public class DescontoAniversario implements DescontoStrategy {
    @Override
    public double aplicar_desconto(double valorInicial, Cliente cliente) {
        double valorFinal = valorInicial;
        if (cliente.aniversario && valorInicial > 25) {
            valorFinal = valorInicial - 10;
            System.out.println("Desconto de R$ 10,00 aplicado!");
        } else {
            System.out.println("Desconto negado! O cliente deve ser aniversariante no dia da compra com um pedido acima de R$ 25,00");
            }
        return valorFinal;
    }
}