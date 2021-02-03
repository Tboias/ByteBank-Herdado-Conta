public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, int agencia) {
        super(numero, agencia);
    }

    @Override
    public boolean sacar(double valor) {
        double valorASacar = valor + 0.2;
        return super.sacar(valorASacar);
    }

}
