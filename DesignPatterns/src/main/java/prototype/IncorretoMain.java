package prototype;

public class IncorretoMain {
    public static void main(String[] args) {
        IncorretoBonecoLego advogado = new IncorretoBonecoLego("masculino", "terno", "pasta") {};
        IncorretoBonecoLego bombeiro = new IncorretoBonecoLego("masculino", "uniforme", "mangueira") {};
        advogado.verPadrao();
        System.out.println("===== ADVOGADO =====");
        advogado.ver();
        System.out.println("====================");
        System.out.println("===== BOMBEIRO =====");
        bombeiro.ver();
        System.out.println("====================");
        
        IncorretoBonecoLego advogada1 = new IncorretoBonecoLego("feminino", "vestido", "pasta") {};
        System.out.println("===== ADVOGADA1 =====");
        advogada1.setRosto("concentrada");
        advogada1.ver();
        System.out.println("=====================");
    }
}
