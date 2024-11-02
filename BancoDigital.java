public class BancoDigital {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Cliente cliente1 = new Cliente("Alice", "123.456.789-00");
        Cliente cliente2 = new Cliente("Bob", "987.654.321-00");

        ContaBancaria conta1 = new ContaBancaria(cliente1);
        ContaBancaria conta2 = new ContaBancaria(cliente2);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Operações de exemplo
        conta1.depositar(500.0);
        conta1.sacar(100.0);
        conta1.transferir(conta2, 200.0);

        banco.exibirContas();
    }
}