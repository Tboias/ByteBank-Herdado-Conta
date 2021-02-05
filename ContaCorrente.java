public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int numero, int agencia) {
        super(numero, agencia);
    }

    @Override
    public void sacar(double valor) throws SaldoException {
        double valorASacar = valor + 0.2;
        super.sacar(valorASacar);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

}
