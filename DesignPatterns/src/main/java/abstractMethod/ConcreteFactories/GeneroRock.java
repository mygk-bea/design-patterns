package abstractMethod.ConcreteFactories;

import abstractMethod.Abstracts.Cordas;
import abstractMethod.Abstracts.Percurssao;

import abstractMethod.ContreteInstrumentos.Guitarra;
import abstractMethod.ContreteInstrumentos.Bateria;

import abstractMethod.GeneroMusical;

public class GeneroRock implements GeneroMusical{
  @Override
  public Cordas criarCordas() {
    return new Guitarra();
  }

  @Override
  public Percurssao criarPercurssao() {
    return new Bateria();
  }  
}
