import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente sergio = new Cliente();
        sergio.setNome("Sergio");

        Cliente ambrosio = new Cliente();
        ambrosio.setNome("Ambrosio");

        Conta ccSergio = new ContaCorrente(sergio);
        Conta poupancaSergio = new ContaPoupanca(sergio);

        Conta ccAmbrosio = new ContaCorrente(ambrosio);
        Conta poupancaAmbrosio = new ContaPoupanca(ambrosio);

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(sergio);
        clientes.add(ambrosio);

        List<Conta> contas = new ArrayList<>();
        contas.add(ccSergio);
        contas.add(poupancaSergio);
        contas.add(ccAmbrosio);
        contas.add(poupancaAmbrosio);

        listarClientes(clientes);

        ccSergio.depositar(100);
        ccSergio.transferir(100, poupancaSergio);

        ccSergio.imprimirExtrato();
        poupancaSergio.imprimirExtrato();
    }

    private static void listarClientes(List<Cliente> clientes) {
        System.out.println("===== Clientes Ativos Cadastrados =====");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
        }
    }
}