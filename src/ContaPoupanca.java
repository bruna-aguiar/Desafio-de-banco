public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void ImprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca");
        super.ImprimirInformacoesCliente();
    }
}
