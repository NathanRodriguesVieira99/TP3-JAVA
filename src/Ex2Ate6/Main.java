package Ex2Ate6;

public class Main {

    public static void main(String[] args) {
        // criando o objeto sem o construtor

        // Produto Play5 = new Produto();

        // Play5.nome = " Play Statipn 5";
        // Play5.preco = 5000.00;
        // Play5.quantidadeEmEstoque = 300;

        // criando o objeto ja com os atributos (com o construtor)
        Produto XBox = new Produto("Xbox", 2500.00, 100);

        // usando os metodos e comparando o produto antes e depois
        System.out.println("Produto original: ");
        XBox.exibirInformacoes("Detalhes do produto:");
        System.out.println("-------------");

        XBox.alterarPreco(2900.00);
        XBox.alterarQuantidade(68);
        System.out.println("Produto atualizado: ");
        XBox.exibirInformacoes("Produto atualizado: ");

        // usando getters e setters

        // get
        System.out.println("Buscando e lendo o nome: ");
        System.out.println("Nome: " + XBox.getNome());

        System.out.println("-------------------------");

        // set
        System.out.println("Setando um novo nome: ");
        XBox.setNome("Xbox One");
        System.out.println(XBox.getNome());

    }

}
