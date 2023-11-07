public class Main {
    public static void main(String[] args) {

        var clientecc = new Cliente("Eduardo maciel bueno", 04705132092F);
        var clientecp = new Cliente("José marcio dias", 29594632649F);

        var cc = new ContaCorrente(clientecc);
        var cp = new ContaPoupanca(clientecp);

        cc.depositar(210);
        cc.imprimirInfoDaConta();

        cp.imprimirInfoDaConta();
        cc.transferir(cp, 200);

        cc.imprimirInfoDaConta();
        cp.imprimirInfoDaConta();
    }
}