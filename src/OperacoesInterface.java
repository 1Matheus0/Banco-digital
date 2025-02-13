public interface OperacoesInterface {

    void deposittar(double valor);

    void sacar(double valor);

    void transferir(double valor, OperacoesInterface contaDestino);

    void imprimirInformacoes();
}
