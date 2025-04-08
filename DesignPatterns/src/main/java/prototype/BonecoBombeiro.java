package prototype;

public class BonecoBombeiro extends BonecoLego{
    public BonecoBombeiro() {
        this.roupa = "uniforme";
        this.acessorios = "capacete e mangueira";
    }

    @Override
    public BonecoLego clone() {
        return new BonecoBombeiro();
    }
    
}
