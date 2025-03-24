package org.example.stream;

import java.util.ArrayList;
import java.util.List;

public class TesteListaStream {
    public static void main (String[] args){

        List<String> contas = new ArrayList<>();

        contas.add("Conta poupanca");
        contas.add("Conta corrente");
        contas.add("Conta pagamento");
        contas.add("Conta poupanca");

        contas.stream().filter( conta -> filterLista(conta)).forEach(conta -> System.out.println("Conta: "+ conta));

        long total = contas.stream().filter(conta -> filterLista(conta)).count();

        System.out.println("Total poupancas: "+ total);


    }

    public static boolean filterLista(String conta){
        return conta.contains("poupanca");
    }
}
