package bridge;

class Thor extends Heroi {
    public Thor(Arma arma) {
        super(arma);
    }

    @Override
    public void atacar() {
        arma.usar(getNome());
    }

    @Override
    public String getNome() {
        return "Thor";
    }
}

/* IMPLEMENTACAO INCORRETA
class Thor {;
    public void atacar() {
        System.out.println("Thor ergue o Martelo e invoca o trovao!");
    }
}
*/