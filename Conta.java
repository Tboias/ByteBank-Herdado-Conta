public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int novaAgencia) {
        this.numero = novaAgencia;
    }

    public abstract void depositar(double valor);

    public void sacar(double valor) throws SaldoException {
        if (this.saldo < valor) {
            throw new SaldoException(
                    "Saldo Insuficiente ! " + " Seu Saldo : " + this.saldo + " Valor Sacado : " + valor);
        }
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta destino) throws SaldoException {
        this.sacar(valor);
        destino.saldo += valor;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return total;
    }
}