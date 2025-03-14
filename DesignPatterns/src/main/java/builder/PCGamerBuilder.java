package builder;

public class PCGamerBuilder extends Computador.Builder{
    public PCGamerBuilder() {
        this.setPlacaMae("ASUS ROG Strix")
            .setProcessador("Intel i9")
            .setMemoriaRAM("32GB")
            .setSSD("1TB NVMe")
            .setHD("1TB")
            .setPlacaVideo("NVIDIA RTX 4090")
            .setGabinete("Cooler Master RGB")
            .setWattsFonte(850)
            .setNumCoolers(6);
    }
}
