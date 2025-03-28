package abstractMethod.formaIncorreta;

public class Banda {
  public String genero;
  private Cavaquinho cavaquinho;
  private Pandeiro pandeiro;
  private Guitarra guitarra;
  private Bateria bateria;
  
  public Banda(String genero) {
    this.genero = genero;
    if("samba".equals(genero)) {
        this.cavaquinho = new Cavaquinho();
        this.pandeiro = new Pandeiro();
    } else if("rock".equals(genero)) {
        this.guitarra = new Guitarra();
        this.bateria = new Bateria();
    }
  }
  
  public void tocar() {
    if("samba".equals(genero)) {
        this.cavaquinho.tocar();
        this.pandeiro.bater();
    } else if("rock".equals(genero)) {
        this.guitarra.tocar();
        this.bateria.bater();
    }
  }
}
