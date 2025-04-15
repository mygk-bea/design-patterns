package adapter;

public class PessoaJapao {
    public String falarJapones() {
        // "こんにちは、元気ですか？" - "Olá, tudo bem?" em japonês
        return "Kon'nichiwa, genkidesuka?";
    }
}
/*
public class PessoaJapao implements IPortuguesBr {
    @Override
    public void conversar(String mensagemIgnorada) {
        String mensagemJaponesa = traduzirParaPortugues(this.falarJapones());
        System.out.println("Remetente (Japao) traduzido: " + mensagemJaponesa);
    }
    
    public String falarJapones() {
        // "こんにちは、元気ですか？" - "Olá, tudo bem?" em japonês
        return "Kon'nichiwa, genkidesuka?";
    }

    private String traduzirParaPortugues(String mensagem) {
        if (mensagem.equals("Kon'nichiwa, genkidesuka?")) {
            return "Oi, como vai?";
        }
        return "????";
    }
}
*/