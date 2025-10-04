package grasp;

public abstract class Item {
    protected String nome;
    protected String tipo;

    public Item(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public abstract void usar(Heroi alvo);

    public String getNome() {
        return nome;
    }
}