package obj.produto.entidades;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double totalValueinStock () {
        return getPreco() * getQuantidade();
    }

    public void addProducts (int quantidade) {
        setQuantidade(getQuantidade() + quantidade);
    }

    public void removeProdutos (int quantidade) {
        if (quantidade <= getQuantidade()) {
            setQuantidade(getQuantidade() - quantidade);
        }
    }

    public void status () {
        System.out.println("-----------------------------------------");
        System.out.print("Nome do produto: "+ getNome()+"\n");
        System.out.print("Valor do produto: "+ getPreco()+"\n");
        System.out.print("Quantidade do produto: "+ getQuantidade()+"\n");
        System.out.print("Valor total: R$"+ totalValueinStock()+"\n");
        System.out.print("-----------------------------------------\n");
    }

}
