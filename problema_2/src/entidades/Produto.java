package entidades;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutosEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutosEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome + ", preço R$"
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidade(s), total: R$ "
                + String.format("%.2f", valorTotalEstoque());
    }

}
