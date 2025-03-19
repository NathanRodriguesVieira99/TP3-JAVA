package Ex7Ate9;

public class Main {

    public static void main(String[] args) {
        // criando objeto com construtor
        Conta conta = new Conta("Nathan", 555, "198", 1000.00, "26/09/2005");

        // usando metodos
        System.out.println("Saldo antes do deposito: " + conta.saldo);
        System.out.println("---------------");
        conta.deposita(100.00);
        System.out.println("---------------");
        System.out.println("Saldo atualizado depois do deposito: " + conta.saldo);

        conta.calculaRendimento();

        System.out.println("Saldo antes: " + conta.saldo);
        System.out.println("---------------");
        conta.saca(900);
        System.out.println("---------------");
        System.out.println("Saldo atual: " + conta.saldo);

    }

}
