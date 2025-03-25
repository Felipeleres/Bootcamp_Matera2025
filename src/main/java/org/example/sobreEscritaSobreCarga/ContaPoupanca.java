package org.example.sobreEscritaSobreCarga;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Double saldo){
        super(saldo);
    }

    @Override
    public void depositar(Double valor){
        this.saldo += valor;
    }
}
