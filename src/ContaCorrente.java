public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("");
        System.out.println("Extrato conta corrente");
        super.imprimirInformacoes();
    }
}
