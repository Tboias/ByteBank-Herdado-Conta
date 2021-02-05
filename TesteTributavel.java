public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(043, 12546);
        cc.depositar(100);

        SeguraDeVida seguro = new SeguraDeVida();

        CalcularImposto ci = new CalcularImposto();
        ci.registraImposto(cc);
        ci.registraImposto(seguro);

        System.out.println(" ");
        System.out.println(" Total de Imposto pago : " + "R$" + ci.getTotalImposto());
        System.out.println(" ");
    }
}