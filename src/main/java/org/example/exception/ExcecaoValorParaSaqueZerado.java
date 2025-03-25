package org.example.exception;

public class ExcecaoValorParaSaqueZerado extends Exception{

    public String getMessage(){
        return "Valor para saque não pode ser Zero";
    }
}
