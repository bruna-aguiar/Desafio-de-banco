import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;

    public String getNome() {
        return nome;
    }
    private List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco() {
        this.contas = new ArrayList<>();
    }
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }
    public void exibirContas() {
        if (contas.isEmpty()) {
            System.out.println("A lista de contas está vazia.");
        } else {
            System.out.println("Lista de Contas:");
            for (Conta conta : contas) {
                System.out.println("Titular: " + conta.cliente.getNome() + " , Conta numero: " + conta.numero); // Exibe as informações formatadas pelo toString().
            }
        }
    }

}
