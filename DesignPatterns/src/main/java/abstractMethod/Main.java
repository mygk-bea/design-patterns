package abstractMethod;

import abstractMethod.ConcreteFactories.GeneroRock;
import abstractMethod.ConcreteFactories.GeneroSamba;

public class Main {
  public static void main(String[] args) {
    GeneroMusical samba = new GeneroSamba();
    Banda exaltasamba = new Banda(samba);
    System.out.println("Banda Exaltasamba:");
    exaltasamba.tocar();
    
    GeneroMusical rock = new GeneroRock();
    Banda legiaoUrbana = new Banda(rock);
    System.out.println("\nBanda Legiao Urbana:");
    legiaoUrbana.tocar();
  }
}
