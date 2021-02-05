package Testes;

public class TesteTributavel {
    public static void main(String[] args) {
        modelo.ContaCorrente cc = new modelo.ContaCorrente(043, 12546);
        cc.depositar(100);

        modelo.SeguraDeVida seguro = new modelo.SeguraDeVida();

        modelo.CalcularImposto ci = new modelo.CalcularImposto();
        ci.registraImposto(cc);
        ci.registraImposto(seguro);

        System.out.println(" ");
        System.out.println(" Total de Imposto pago : " + "R$" + ci.getTotalImposto());
        System.out.println(" ");
    }
}