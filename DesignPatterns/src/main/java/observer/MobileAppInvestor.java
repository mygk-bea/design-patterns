package observer;

public class MobileAppInvestor implements Investor {
    @Override
    public void update(double price) {
        System.out.println("[MobileApp] Notificacao recebida: preco atualizado para " + price);
    }
}
