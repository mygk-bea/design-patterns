package abstractMethod.ContreteInstrumentos;

import abstractMethod.Abstracts.Cordas;

public class Cavaquinho extends Cordas{
  @Override
  public void tocar() {
    System.out.println("Tocando cavaquinho...");
  }  
}
