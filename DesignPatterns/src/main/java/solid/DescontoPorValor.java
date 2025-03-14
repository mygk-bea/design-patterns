package solid;

/*
* Código completo RESPEITANDO os princípios SOLID
*/

public class DescontoPorValor implements Desconto {
    @Override
    public double calcularDesconto(double valor) { 
        return valor == 100 ? valor * 0.1 : 0; // 10% de desconto
    }
    
}
