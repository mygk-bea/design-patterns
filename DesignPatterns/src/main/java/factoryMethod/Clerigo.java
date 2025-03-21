package factoryMethod;

public class Clerigo implements Personagem{
    @Override
    public void atacar() {
        System.out.println("O Clerigo esta curando seus aliados!");
    }

    @Override
    public void interagir() {
        System.out.println("O Clerigo esta orando!");
    }
}
