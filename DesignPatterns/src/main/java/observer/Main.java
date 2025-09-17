package observer;

public class Main {
    public static void main(String[] args) {
        ConcreteStock stock = new ConcreteStock("XPTO3", 95.0);

        Investor mobile = new MobileAppInvestor();
        Investor bot = new TradingBotInvestor();
        Investor dashboard = new DashboardInvestor();

        stock.addInvestor(mobile);
        stock.addInvestor(bot);
        stock.addInvestor(dashboard);

        stock.setPrice(98.5);
        stock.setPrice(101.0);
    }
}
