package abstractMethod.ContreteInstrumentos;

import abstractMethod.Abstracts.Cordas;

public class Guitarra extends Cordas{
  @Override
  public void tocar() {
    System.out.println("Tocando um solo da guitarra...");
  }  
}
