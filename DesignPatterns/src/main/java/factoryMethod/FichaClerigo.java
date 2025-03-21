package factoryMethod;

public class FichaClerigo extends Ficha{
    @Override
    public Personagem criarPersonagem() {
        return new Clerigo();
    }
}
