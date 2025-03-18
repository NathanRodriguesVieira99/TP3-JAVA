package Ex2Ate6;

// criação da classe
public class Produto {
    // atributos
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // construtor (ja atribui valores aos objetos filhos criados)
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // getters e setters (permitem ler e atribuir valores)
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

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // métodos
    void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    void alterarQuantidade(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    void exibirInformacoes(String informacoes) {
        System.out.println("Dados do produto: ");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }
}
