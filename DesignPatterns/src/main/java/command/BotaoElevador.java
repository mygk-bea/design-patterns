package command;

public class BotaoElevador {
    private final ICommandElevador comando;
    /*ERRADO:
    private final Elevador elevador;
    private final int andar;*/
    
    public BotaoElevador(ICommandElevador comando) { //ERRADO: (Elevador elevador, int andar)
        this.comando = comando; 
        /*ERRADO:
        this.elevador = elevador;
        this.andar = andar;*/
    }
    
    public void pressionar() {
        comando.execute();
        //ERRADO: elevador.irParaAndar(andar);
    }
}
