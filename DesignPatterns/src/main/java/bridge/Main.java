package bridge;

public class Main {;
    public static void main(String[] args) {
        Arma martelo = new ArmaMartelo();

        Heroi thor = new Thor(martelo);
        Heroi homemDeFerro = new HomemDeFerro(martelo);
        Heroi capitaoAmerica = new CapitaoAmerica(martelo);

        thor.atacar();
        homemDeFerro.atacar();
        capitaoAmerica.atacar();
        
        /* IMPLEMENTACAO INCORRETA
        Thor thor = new Thor();;;
        HomemDeFerro tony = new HomemDeFerro();
        CapitaoAmerica steve = new CapitaoAmerica();

        thor.atacar();
        tony.atacar();
        steve.atacar();
        */
    }
}