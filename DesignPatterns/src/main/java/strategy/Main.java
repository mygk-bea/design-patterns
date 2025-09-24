package strategy;

public class Main {
    public static void main(String[] args) {
        // ESTUDANTES
        Cliente cliente1 = new Cliente("Ana Laura", 16,true,false);
        Cliente cliente2 = new Cliente("Matheus", 22,true,false);
    
        // IDOSO
        Cliente cliente3 = new Cliente("Roberto", 62,false,false);
        
        // ANIVERSARIANTES
        Cliente cliente4 = new Cliente("Joana", 19,false,true);
        Cliente cliente5 = new Cliente("Marianny", 26,false,true);
        
        // COMUM
        Cliente cliente6 = new Cliente("Lucas", 35,false,false);
        
        Pedido pedido1 = new Pedido(25.00 ,cliente1, new DescontoEstudante());
        Pedido pedido2 = new Pedido(56.90 ,cliente2, new DescontoEstudante());
        Pedido pedido3 = new Pedido(40.00 ,cliente3, new DescontoIdoso());
        Pedido pedido4 = new Pedido(16.00 ,cliente4, new DescontoAniversario());
        Pedido pedido5 = new Pedido(45.50 ,cliente5, new DescontoAniversario());
        Pedido pedido6 = new Pedido(60.00 ,cliente6, new DescontoEstudante());
        Pedido pedido7 = new Pedido(60.00 ,cliente6, new DescontoIdoso());
        Pedido pedido8 = new Pedido(60.00 ,cliente6, new DescontoAniversario());
        Pedido pedido9 = new Pedido(60.00 ,cliente6, new SemDesconto());
        
        // PEDIDOS DE ESTUDANTES
        pedido1.finalizar_pedido();
        pedido2.finalizar_pedido();
        
        // PEDIDO DO IDOSO
        pedido3.finalizar_pedido();
        
        // PEDIDOS DE ANIVERSARIANTES
        pedido4.finalizar_pedido();
        pedido5.finalizar_pedido();
        
        // PEDIDOS COMUNS -- TENTATIVAS DE APLICACAO DE DESCONTO
        pedido6.finalizar_pedido();
        pedido7.finalizar_pedido();
        pedido8.finalizar_pedido();
        pedido9.finalizar_pedido();
    }
}
