package abstractMethod.formaIncorreta;

public class Main {
  public static void main(String[] args) {
    System.out.println("Banda Exaltasamba:");
    Banda exalta = new Banda("samba");
    exalta.tocar();
    
    System.out.println("\nBanda Legiao Urbana:");
    Banda legiao = new Banda("rock");
    legiao.tocar();
  }
}