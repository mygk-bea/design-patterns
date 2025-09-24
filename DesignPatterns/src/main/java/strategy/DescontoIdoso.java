package strategy;

public class DescontoIdoso implements DescontoStrategy {
    @Override
    public double aplicar_desconto(double valorInicial, Cliente cliente) {
        double valorFinal = valorInicial;
        if (cliente.idade >= 60) {
            double desconto = (valorInicial * 0.20);
            valorFinal = valorInicial - desconto;
            System.out.println("Desconto de 20% aplicado!(- R$ " + String.format("%.2f", desconto) + ")");
        } else {
            System.out.println("Desconto negado! O cliente deve ser idoso");
        }
        return valorFinal;
    }
}