package abstractMethod;

import abstractMethod.Abstracts.Cordas;
import abstractMethod.Abstracts.Percurssao;

public class Banda {
  private final Cordas instrumentoCordas;
  private final Percurssao instrumentoPercurssao;
  
  public Banda(GeneroMusical factory) {
    instrumentoCordas = factory.criarCordas();
    instrumentoPercurssao = factory.criarPercurssao();
  }
  
  public void tocar() {
    instrumentoCordas.tocar();
    instrumentoPercurssao.bater();
  }
}
