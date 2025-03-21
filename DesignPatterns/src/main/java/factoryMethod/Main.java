package factoryMethod;

public class Main {
    public static void main(String[] args) {
        Ficha fichaMago = new FichaMago();
        Personagem mago = fichaMago.criarPersonagem();
        mago.atacar();
        mago.interagir();
        
        Ficha fichaClerigo = new FichaClerigo();
        Personagem clerigo = fichaClerigo.criarPersonagem();
        clerigo.atacar();
        clerigo.interagir();
        
        Ficha fichaHumano = new FichaHumano();
        Personagem humano = fichaHumano.criarPersonagem();
        humano.atacar();
        humano.interagir();

        /*
        // EXEMPLO COM VARIACAO DO FACTORY METHOD
        FichaParametrizada ficha = new FichaParametrizada();
        
        Personagem mago = ficha.criarPersonagem("Mago");
        mago.atacar();
        mago.interagir();
        
        Personagem clerigo = ficha.criarPersonagem("Clerigo");
        clerigo.atacar();
        clerigo.interagir();
        
        Personagem humano = ficha.criarPersonagem("Humano");
        humano.atacar();
        humano.interagir();
        */
    }
}
