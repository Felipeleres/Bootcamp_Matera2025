package org.example.sobreEscritaSobreCarga;

public class TesteSobreEscritaSobreCarga {
    public static void main(String[] args) {

        ContaPoupanca contapoupanca = new ContaPoupanca(6000.00);
        contapoupanca.depositar(500.00);

        ContaCorrente contacorrenteSemTaxa = new ContaCorrente(9000.00);
        contacorrenteSemTaxa.sacar(1000.00);

        ContaCorrente contacorrenteComTaxa = new ContaCorrente(9000.00);
        contacorrenteComTaxa.sacar(1000.00,0.50);

        System.out.println("Saldo da conta poupanca: "+ contapoupanca.getSaldo());
        System.out.println("Saldo da conta corrente sem taxa: "+ contacorrenteSemTaxa.getSaldo());
        System.out.println("Saldo da conta corrente com taxa: "+ contacorrenteComTaxa.getSaldo());


    }
}
