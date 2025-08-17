package command;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        ICommandElevador comando1 = new CommandIrParaAndar(elevador, 1);
        ICommandElevador comando5 = new CommandIrParaAndar(elevador, 5);
        ICommandElevador comando3 = new CommandIrParaAndar(elevador, 3);

        BotaoElevador botao1 = new BotaoElevador(comando1); //ERRADO: (elevador, 1)
        BotaoElevador botao5 = new BotaoElevador(comando5); //ERRADO: (elevador, 5)
        BotaoElevador botao3 = new BotaoElevador(comando3); //ERRADO: (elevador, 3)

        botao1.pressionar();
        botao5.pressionar();
        botao3.pressionar();
    }
}
