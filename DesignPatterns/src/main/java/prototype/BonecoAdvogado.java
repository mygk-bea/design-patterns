package prototype;

public class BonecoAdvogado extends BonecoLego{
    public BonecoAdvogado() {
        this.roupa = "terno";
        this.acessorios = "maleta de documentos";
    }

    @Override
    public BonecoLego clone() {
        return new BonecoAdvogado();
    }
    
}
