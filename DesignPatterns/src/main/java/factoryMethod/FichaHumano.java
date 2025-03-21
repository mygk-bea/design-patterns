package factoryMethod;

public class FichaHumano extends Ficha{
    @Override
    public Personagem criarPersonagem() {
        return new Humano();
    }
}
