/* EXEMPLO DE VARIACAO DO FACTORY METHOD
package factoryMethod;

public class FichaParametrizada extends Ficha{

    @Override
    public Personagem criarPersonagem(String classe) {
        switch (classe) {
            case "Humano": return new Humano();
            case "Mago": return new Mago();
            case "Clerigo": return new Clerigo();
            default: throw new IllegalArgumentException("Classe invalida!");
        }
    }
}
*/