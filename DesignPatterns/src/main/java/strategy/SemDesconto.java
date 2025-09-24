package strategy;

public class SemDesconto implements DescontoStrategy {
    @Override
    public double aplicar_desconto(double valorInicial, Cliente cliente) {
        return valorInicial;
    }
}