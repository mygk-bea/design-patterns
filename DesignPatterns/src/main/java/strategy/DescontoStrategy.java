package strategy;

public interface DescontoStrategy {
    double aplicar_desconto(double valorInicial, Cliente cliente);
}
