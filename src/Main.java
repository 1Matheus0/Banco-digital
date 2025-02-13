import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        Cliente claudio = new Cliente("Claudio Araujo");
        System.out.println(claudio.getNome());

        Conta corrente = new ContaCorrente(claudio);
        Conta poupanca = new ContaPoupanca(claudio);

        corrente.deposittar(100);
        corrente.transferir(50, poupanca);

        corrente.imprimirInformacoes();
        poupanca.imprimirInformacoes();


    }
}