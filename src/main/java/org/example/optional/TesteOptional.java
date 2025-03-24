package org.example.optional;

import org.example.Collections.set.Conta;

import java.util.Optional;

public class TesteOptional {
    public static void main ( String [] args){


        Optional<Conta> conta = obtemContaSemErro();

        if(conta.isPresent()) {
            System.out.println("Saldo:" + conta.get().getSaldo());
        } else{
            System.out.println("Não foi localizada a conta");
        }

    }
    public static Conta obtemConta(){
        return null;
    }

    public static Optional<Conta> obtemContaSemErro(){
        return Optional.empty();
    }
}
