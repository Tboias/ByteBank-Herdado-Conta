package modelo;

public class CalcularImposto {

    private double totalImposto;

    public void registraImposto(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }

}