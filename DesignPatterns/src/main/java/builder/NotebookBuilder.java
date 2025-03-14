package builder;

public class NotebookBuilder extends Computador.Builder {
    public NotebookBuilder() {
        this.setPlacaMae("Notebook OEM")
            .setProcessador("Intel i7")
            .setMemoriaRAM("16GB")
            .setSSD("512GB NVMe")
            .setPolTela(15)
            .setMAhBateria(6000)
            .setWattsFonte(100)
            .setNumCoolers(1);
    }
}
