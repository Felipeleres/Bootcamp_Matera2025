package org.example.Collections.set;

import java.util.HashSet;
import java.util.Set;

public class TesteSetConta {
    public static void main(String[] args) {

    Set<Conta> contas = new HashSet<>();

    contas.add(new Conta(100L,252.00));
    contas.add(new Conta(100L,300.00));

    contas.add(Conta.builder()
                    .saldo(258.00)
                    .numeroConta(101L)
            .build());

    contas.forEach(conta ->System.out.println((conta)));

}
}
