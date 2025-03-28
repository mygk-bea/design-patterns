package abstractMethod.ContreteInstrumentos;

import abstractMethod.Abstracts.Percurssao;

public class Pandeiro extends Percurssao{
  @Override
  public void bater() {
    System.out.println("Batendo no pandeiro no ritmo do samba...");
  }
}
