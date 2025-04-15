package adapter;

public class PessoaBrasil implements IPortuguesBr {
    @Override
    public void conversar(String mensagemPortugues) {
        System.out.println("Destinatario (Brasil) respondeu: " + mensagemPortugues);
    }
}
