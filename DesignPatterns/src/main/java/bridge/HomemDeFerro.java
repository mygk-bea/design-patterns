package bridge;

class HomemDeFerro extends Heroi {
    public HomemDeFerro(Arma arma) {
        super(arma);
    }

    @Override
    public void atacar() {
        arma.usar(getNome());
    }

    @Override
    public String getNome() {
        return "Homem de Ferro";
    }
}

/* IMPLEMENTACAO INCORRETA
class HomemDeFerro {;
    public void atacar() {
        System.out.println("Homem de Ferro tenta levantar o Martelo... mas nao e digno.");
    }
}
*/