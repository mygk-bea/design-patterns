package singleton;

public class Main {
    public static void main(String[] args) {
        ConfigEmail config = ConfigEmail.getInstance();
        System.out.println("\n-- Original: config --");
        System.out.println(config.getConfig());

        ConfigEmail config2 = ConfigEmail.getInstance();
        System.out.println("\n-- Original: config2 --");
        System.out.println(config2.getConfig());

        config2.setAssunto("Aviso! Reuniao de Emergencia");
        config2.setConteudo("Reuniao sobre bug as 14:30...");
        config2.setCorCabecalho("yellow");

        System.out.println("\n-- Mudanças: config --");
        System.out.println(config.getConfig());
    }
}
