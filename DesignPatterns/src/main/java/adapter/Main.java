package adapter;

public class Main {;
    public static void main(String[] args) {
        PessoaJapao japones = new PessoaJapao();
        IPortuguesBr brasileiro = new PessoaBrasil();
        IPortuguesBr japonesViaAdapter = new TradutorAdapter(japones);

        System.out.println("Remetente (Japao) original romaji: " + japones.falarJapones());
        japonesViaAdapter.conversar(null);
        brasileiro.conversar("Bem! E voce?");
    }
}
/*
public class Main {
    public static void main(String[] args) {
        IPortuguesBr brasileiro = new PessoaBrasil();
        IPortuguesBr japones = new PessoaJapao();

        System.out.println("Remetente (Japao) original romaji: Kon'nichiwa, genkidesuka?");
        japones.conversar(null);
        brasileiro.conversar("Bem! E voce?");
    }
}
*/