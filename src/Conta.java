public abstract class Conta implements iConta{

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroDaConta;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroDaConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) saldo -= valor;
        else System.out.println("Saldo insuficiente");
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if (valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferencia realizada com sucesso no valor de " + valor);
        } else System.out.println("Saldo insuficiente");
    }

    @Override
    public void imprimirInfoDaConta() {
        System.out.println("--Extrato da conta--");
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Conta: %d", numeroDaConta));
        System.out.println(String.format("Conta: %s", cliente.getNome()));
        System.out.println(String.format("Saldo: %.2f", saldo));

    }

}
