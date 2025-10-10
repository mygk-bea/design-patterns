package grasp_avaliacao;

class Item {
    private String nome;
    private double precoUnitario;
    private boolean ehLanche;

    public Item(String nome, double precoUnitario, boolean ehLanche) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.ehLanche = ehLanche;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public boolean ehLanche() {
        return ehLanche;
    }

    @Override
    public String toString() {
        return String.format("%s (Preço: R$%.2f, É Lanche: %b)", nome, precoUnitario, ehLanche);
    }
}