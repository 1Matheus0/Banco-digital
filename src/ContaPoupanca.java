public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("");
        System.out.println("Extrato conta poupanca");
        super.imprimirInformacoes();
    }
}
