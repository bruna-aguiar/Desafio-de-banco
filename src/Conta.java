public abstract class Conta implements IConta {
    // Uma classe abstrata nao pode ser instanciada
    private static final int AGENCIA_PADRAO = 1;
    // Quando um atributo é declarado como static, ele pertence à classe, e não às instâncias individuais.
    // Quando um atributo não é declarado como static, ele pertence a cada instância da classe.
    protected static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    // Você pode usar o this para chamar métodos ou acessar atributos da instância atual
    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);

    }
    protected void ImprimirInformacoesCliente() {
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Agencia : " + this.agencia);
        System.out.println("Numero : " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }

}
