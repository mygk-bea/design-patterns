package builder;

public class Computador {
    private final String placaMae;
    private final String processador;
    private final String memoriaRAM;
    private final String HD;
    private final String SSD;
    private final String placaVideo;
    private final String gabinete;
    private final int wattsFonte;
    private final int numCoolers;
    private final int polTela;
    private final int mAhBateria;
    
    private Computador(Builder builder){
        this.placaMae = builder.placaMae;
        this.processador = builder.processador;
        this.memoriaRAM = builder.memoriaRAM;
        this.HD = builder.HD;
        this.SSD = builder.SSD;
        this.placaVideo = builder.placaVideo;
        this.gabinete = builder.gabinete;
        this.wattsFonte = builder.wattsFonte;
        this.numCoolers = builder.numCoolers;
        this.polTela = builder.polTela;
        this.mAhBateria = builder.mAhBateria;
    }
    
    public String getPlacaMae(){return placaMae;}
    public String getProcessador(){return processador;}
    public String getMemoriaRAM(){return memoriaRAM;}
    public String getHD(){return HD;}
    public String getSSD(){return SSD;}
    public String getPlacaVideo(){return placaVideo;}
    public String getGabinete(){return gabinete;}
    public int getWattsFonte(){return wattsFonte;}
    public int getNumCoolers(){return numCoolers;}
    public int getPolTela(){return polTela;}
    public int getMAhBateria(){return mAhBateria;}

    @Override
    public String toString() {
        return "Computador:\n" +
               "placaMae='" + placaMae + "'\n" +
               "processador='" + processador + "'\n" +
               "memoriaRAM='" + memoriaRAM + "'\n" +
               "HD='" + HD + "'\n" +
               "SSD='" + SSD + "'\n" +
               "placaVideo='" + placaVideo + "'\n" +
               "gabinete='" + gabinete + "'\n" +
               "wattsFonte=" + wattsFonte + "\n" +
               "numCoolers=" + numCoolers + "\n" +
               "polTela=" + polTela + "\n" +
               "mAhBateria=" + mAhBateria;
    }

    public static class Builder {
        private String placaMae;
        private String processador;
        private String memoriaRAM;
        private String HD;
        private String SSD;
        private String placaVideo;
        private String gabinete;
        private int wattsFonte;
        private int numCoolers;
        private int polTela;
        private int mAhBateria;
        
        public Builder setPlacaMae(String placaMae){
            this.placaMae = placaMae; 
            return this;
        }
        public Builder setProcessador(String processador){
            this.processador = processador; 
            return this;
        }
        public Builder setMemoriaRAM(String memoriaRAM){
            this.memoriaRAM = memoriaRAM;
            return this;
        }
        public Builder setHD(String HD){
            this.HD = HD;
            return this;
        }
        public Builder setSSD(String SSD){
            this.SSD = SSD;
            return this;
        }
        public Builder setPlacaVideo(String placaVideo){
            this.placaVideo = placaVideo;
            return this;
        }
        public Builder setGabinete(String gabinete){
            this.gabinete = gabinete;
            return this;
        }
        public Builder setWattsFonte(int wattsFonte){
            this.wattsFonte = wattsFonte;
            return this;
        }
        public Builder setNumCoolers(int numCoolers){
            this.numCoolers = numCoolers;
            return this;
        }
        public Builder setPolTela(int polTela){
            this.polTela = polTela;
            return this;
        }
        public Builder setMAhBateria(int mAhBateria){
            this.mAhBateria = mAhBateria;
            return this;
        }
        public Computador build() {
            return new Computador(this);
        }
    }
}
