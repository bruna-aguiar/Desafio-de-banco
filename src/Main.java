public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente joao = new Cliente();
        joao.setNome("Joao");

        Cliente maria = new Cliente();
        maria.setNome("Maria");
        // Criando a primeira conta corrente
        Conta contaJose = new ContaCorrente(joao);
        contaJose.depositar(100);

        // Criando outra conta corrente
        Conta contaMaria = new ContaPoupanca(maria);


        contaJose.transferir(80,contaMaria);
        contaJose.ImprimirExtrato();
        contaMaria.ImprimirExtrato();

        banco.adicionarConta(contaJose);
        banco.adicionarConta(contaMaria);

        banco.exibirContas();
    }
}
