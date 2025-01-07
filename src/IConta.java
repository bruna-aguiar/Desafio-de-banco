public interface IConta {
    // todos os metodos de uma interface ja são publicos nao precisa colocar o "public"
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void ImprimirExtrato();
}
