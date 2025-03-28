package abstractMethod.ContreteInstrumentos;

import abstractMethod.Abstracts.Percurssao;

public class Bateria extends Percurssao{
  @Override
  public void bater() {
    System.out.println("Tocando bateria ao som de rock...");
  }
}
