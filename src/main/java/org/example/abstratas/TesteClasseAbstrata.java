package org.example.abstratas;

public class TesteClasseAbstrata {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.imprimeExtrato();

        ContaPoupanca contaPoupança = new ContaPoupanca();
        contaPoupança.imprimeExtrato();


    }
}
