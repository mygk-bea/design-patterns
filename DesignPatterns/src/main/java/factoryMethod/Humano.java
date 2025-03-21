package factoryMethod;

public class Humano implements Personagem{
    @Override
    public void atacar() {
        System.out.println("O Humano esta atacando!");
    }

    @Override
    public void interagir() {
        System.out.println("O Humano esta procurando o que fazer!");
    }
}
