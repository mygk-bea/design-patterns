package adapter;

public class TradutorAdapter implements IPortuguesBr {
    private PessoaJapao pessoaJapao;

    public TradutorAdapter(PessoaJapao pessoaJapao) {
        this.pessoaJapao = pessoaJapao;
    }

    @Override
    public void conversar(String mensagemIgnorada) {
        String falaJaponesa = pessoaJapao.falarJapones();
        String traduzida = traduzir(falaJaponesa);
        System.out.println("Remetente (Japao) traduzido: " + traduzida);
    }

    private String traduzir(String japones) {
        if (japones.equals("Kon'nichiwa, genkidesuka?")) {
            return "Ola, tudo bem?";
        }
        return "Mensagem não compreendida.";
    }
}