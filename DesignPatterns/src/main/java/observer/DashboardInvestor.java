package observer;

public class DashboardInvestor implements Investor {
    @Override
    public void update(double price) {
        System.out.println("[Dashboard] Atualizando grafico com novo preco: " + price);
    }
}
