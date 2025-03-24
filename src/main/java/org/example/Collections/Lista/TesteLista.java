package org.example.Collections.Lista;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {
    public static void main (String[] args){

        List<String> contas = new ArrayList<>();

        contas.add("Conta poupança");
        contas.add("Conta corrente");
        contas.add("Conta pagamento");
        contas.add("Conta poupança");

        System.out.println("Conta1: "+ contas.get(0));
        System.out.println("Conta1: "+ contas.get(1));
        System.out.println("Conta1: "+ contas.get(2));
        System.out.println("Conta4: "+ contas.get(3));

        // sempre que for uma lista eu posso repetir valores.
    }
}
