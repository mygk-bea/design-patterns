package factoryMethod;

public class FichaMago extends Ficha{
    @Override
    public Personagem criarPersonagem() {
        return new Mago();
    }
}
