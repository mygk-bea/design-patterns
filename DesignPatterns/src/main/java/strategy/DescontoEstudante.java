package strategy;

public class DescontoEstudante implements DescontoStrategy {
    @Override
    public double aplicar_desconto(double valorInicial, Cliente cliente) {
        double valorFinal = valorInicial;
        if (cliente.estudante && valorInicial > 29.90) {
            double desconto = (valorInicial * 0.15);
            valorFinal = valorInicial - desconto;
            System.out.println("Desconto de 15% aplicado! (- R$ " + String.format("%.2f", desconto) + ")");
        } else {
            System.out.println("Desconto negado! O cliente deve ser um estudante com um pedido acima de R$ 29,90");
            }
        return valorFinal;
    }
}