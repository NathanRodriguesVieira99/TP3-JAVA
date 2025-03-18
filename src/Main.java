public class Main {
    public static void main(String[] args) {
        // criação de objeto
        Ninja Sasuke = new Ninja();

        // atribuindo valores ao novo objeto
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.sensei = "Kakashi Hatake";
        Sasuke.aldeia = "Vila Oculta da Folha";
        Sasuke.melhorTecnica = "Shidori";

        // usando os métodos

        // usando o metodo de usar tecnica
        Sasuke.usarTecnica();

        // criando um novo ninja com metodo de criação
        Ninja newNinja = new Ninja();
        newNinja.cadastrarShinobi();
        System.out.println("Dados do shinobi cadastrado: ");
        System.out.println("Nome: " + newNinja.nome);
        System.out.println("Sensei: " + newNinja.sensei);
        System.out.println("Aldeia: " + newNinja.sensei);
        System.out.println("Melhor Tecnica: " + newNinja.melhorTecnica);

        newNinja.usarTecnica();

    }
}
