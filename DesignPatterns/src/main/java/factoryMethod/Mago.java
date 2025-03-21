package factoryMethod;

public class Mago implements Personagem{ 
    @Override
    public void atacar() {
        System.out.println("O Mago esta lancando um feitico!");
    }

    @Override
    public void interagir() {
        System.out.println("O Mago esta lendo!");
    }
}
