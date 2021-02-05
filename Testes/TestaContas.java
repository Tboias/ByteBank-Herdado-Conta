
package Testes;

public class TestaContas {
    public static void main(String[] args) throws modelo.SaldoException {
        modelo.ContaCorrente cc = new modelo.ContaCorrente(134, 14556);
        cc.depositar(100.0);

        modelo.ContaPoupanca cp = new modelo.ContaPoupanca(135, 12534);
        cp.depositar(200.0);
        cc.sacar(1);
        cp.transferir(10, cc);

        System.out.println(" ");
        System.out.println(" Seu saldo é : " + cc.getSaldo());
        System.out.println(" Seu saldo é : " + cp.getSaldo());
        System.out.println(" ");

    }
}