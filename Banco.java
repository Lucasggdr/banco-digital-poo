import java.util.ArrayList;

class Banco {
    private String nomeBanco;
    private ArrayList<ContaBancaria> contas;

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
        System.out.println("Conta adicionada com sucesso: " + conta.getNumeroConta());
    }

    public ContaBancaria buscarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public void exibirContas() {
        System.out.println("Contas do banco " + nomeBanco + ":");
        for (ContaBancaria conta : contas) {
            System.out.println("Conta " + conta.getNumeroConta() + " - Cliente: " + conta.getCliente().getNome() + " - Saldo: R$" + conta.getSaldo());
        }
    }
}