package Ex7Ate9;

// cria a classe
public class Conta {
    // atributos
    private String titular;
    private int numeroConta;
    private String agencia;
    public double saldo;
    private String dataAbertura;

    // cria construtor
    public Conta(String titular, int numeroConta, String agencia, double saldo, String dataAbertura) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    // metodos
    public void saca(double valorRetiradoDoSaldo) {
        if (valorRetiradoDoSaldo > 0 && valorRetiradoDoSaldo <= saldo) {
            saldo -= valorRetiradoDoSaldo;
        }
        System.out.println("Saque de R$: " + valorRetiradoDoSaldo + " realizado");
    }

    public void deposita(double valorDepositado) {
        if (valorDepositado > 0) {
            saldo += valorDepositado;
        }
        System.out.println("Deposito de R$:" + valorDepositado + " realizado");
    }

    public double calculaRendimento() {
        double rendimento = saldo * 0.1;
        System.out.println("Seu rendimento é: " + rendimento);
        return rendimento;
    }
}
