package br.com.bytebank.banco.Testes;

import br.com.bytebank.banco.modelo.*;

public class TesteSaca {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(043, 8181658);

        cc.depositar(200);

        try {
            cc.sacar(201);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(cc.getSaldo());
    }
}