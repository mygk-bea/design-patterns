package prototype;

public class Main {
    public static void main(String[] args) {
        BonecoLego prototipo_advogado = new BonecoAdvogado();
        BonecoLego prototipo_bombeiro = new BonecoBombeiro();
        prototipo_advogado.verPadrao();
        
        BonecoLego advogada1 = prototipo_advogado.clone();
        System.out.println("===== ADVOGADA1 =====");
        advogada1.ver();
        System.out.println("---------------------");
        advogada1.setGenero("feminino");
        advogada1.ver();
        System.out.println("=====================");
        
        BonecoLego bombeiro1 = prototipo_bombeiro.clone();
        System.out.println("===== BOMBEIRO1 =====");
        bombeiro1.ver();
        System.out.println("---------------------");
        bombeiro1.setRosto("feliz");
        bombeiro1.ver();
        System.out.println("=====================");
    }
}
