package bridge;

abstract class Heroi {
    protected Arma arma;

    public Heroi(Arma arma) {
        this.arma = arma;
    }

    abstract void atacar();
    abstract String getNome();
}
