package abstractMethod.ConcreteFactories;

import abstractMethod.Abstracts.Cordas;
import abstractMethod.Abstracts.Percurssao;

import abstractMethod.ContreteInstrumentos.Cavaquinho;
import abstractMethod.ContreteInstrumentos.Pandeiro;

import abstractMethod.GeneroMusical;

public class GeneroSamba implements GeneroMusical{
  @Override
  public Cordas criarCordas() {
    return new Cavaquinho();
  }

  @Override
  public Percurssao criarPercurssao() {
    return new Pandeiro();
  }  
}
