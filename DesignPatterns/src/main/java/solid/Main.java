package solid;

/*
* Código completo RESPEITANDO os princípios SOLID
*/

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Joao", 120, new DescontoPorValor(), new EmailServiceImpl());
        System.out.println(pedido.gerarResumo());
        pedido.enviaEmail();
    }
}
