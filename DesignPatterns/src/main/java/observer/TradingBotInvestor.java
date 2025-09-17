package observer;

public class TradingBotInvestor implements Investor {
    @Override
    public void update(double price) {
        if (price > 100) {
            System.out.println("[TradingBot] Preco acima de 100! Vendendo acoes automaticamente.");
        } else {
            System.out.println("[TradingBot] Preco abaixo de 100! Comprando acoes automaticamente.");
        }
    }
}
