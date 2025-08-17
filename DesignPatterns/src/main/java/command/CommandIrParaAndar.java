package command;

public class CommandIrParaAndar implements ICommandElevador {
    private final Elevador elevador;
    private final int andar;
    
    public CommandIrParaAndar(Elevador elevador, int andar) {
        this.elevador = elevador;
        this.andar = andar;
    }

    @Override
    public void execute() {
        elevador.irParaAndar(andar);
    }
}
