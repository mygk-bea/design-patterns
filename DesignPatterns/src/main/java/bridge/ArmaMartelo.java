package bridge;

class ArmaMartelo implements Arma {
    public void usar(String heroi) {
        if (heroi.equals("Thor") || heroi.equals("Capitao America")) {
            System.out.println(heroi + " ergue o Martelo e invoca o trovao!");
        } else {
            System.out.println(heroi + " tenta levantar o Martelo... mas nao e digno.");
        }
    }
}
