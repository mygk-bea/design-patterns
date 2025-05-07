/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

class CapitaoAmerica extends Heroi {
    public CapitaoAmerica(Arma arma) {
        super(arma);
    }

    @Override
    public void atacar() {
        arma.usar(getNome());
    }

    @Override
    public String getNome() {
        return "Capitao America";
    }
}

/* IMPLEMENTACAO INCORRETA
class CapitaoAmerica {;
    public void atacar() {
        System.out.println("Capitao America ergue o Martelo e invoca o trovao!");
    }
}
*/