package observer;

import java.util.*;

public class ConcreteStock implements Stock {
    private String name;
    private double price;
    private List<Investor> investors = new ArrayList<>();

    public ConcreteStock(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void addInvestor(Investor investor) {
        investors.add(investor);
    }

    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(price);
        }
    }

    public void setPrice(double price) {
        System.out.println("\n[Stock] " + name + " novo preco: " + price);
        this.price = price;
        notifyInvestors();
    }

    public double getPrice() {
        return price;
    }
}
