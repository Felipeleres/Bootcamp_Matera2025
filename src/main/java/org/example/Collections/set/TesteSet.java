package org.example.Collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteSet {

    public static void main (String[] args){

        Set<String> contas = new HashSet<>();

        contas.add("Conta poupança");
        contas.add("Conta corrente");
        contas.add("Conta pagamento");
        contas.add("Conta poupança");

        contas.forEach(conta ->{
            System.out.println(conta);
        });
    }

}
