import java.util.List;

public class Conta implements OperacoesInterface {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAl = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAl++;
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
    public void deposittar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(double valor, OperacoesInterface contaDestino) {
        this.sacar(valor);
        contaDestino.deposittar(valor);
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println(String.format("Titular: "+ this.cliente.getNome()));
        System.out.println(String.format("Agencia: ")+ this.agencia);
        System.out.println(String.format("Numero: "+this.numero));
        System.out.println(String.format("Saldo: "+this.saldo));
    }
}
