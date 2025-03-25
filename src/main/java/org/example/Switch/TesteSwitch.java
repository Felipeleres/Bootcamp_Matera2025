package org.example.Switch;

public class TesteSwitch {
    public static void main(String[] args){
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        exibeTipoConta(contaCorrente);
        exibeTipoConta(contaPoupanca);

    }

    public static void exibeTipoConta(Conta conta){
        switch(conta.getTipoConta()){
            case "Conta Corrente":
                System.out.println("É uma conta corrente. ");
                break;

            case "Conta Comun":
                System.out.println("É uma conta comun");
                break;

            case "Conta Poupanca":
                System.out.println("É uma conta poupanca");
                break;
            default:
                System.out.println("Não identificado o tipo de conta");
        }
    }

    public static void exibeTipoConta17(Conta conta){
        String mensagem = switch(conta.getTipoConta()){
            case "Conta Corrente" -> "É uma conta corrente";

            case "Conta Comun" -> "É uma conta comun";

            case "Conta Poupanca" -> "É uma conta poupanca";
            default -> "Não identificado o tipo de conta";

        };

        System.out.println(mensagem);
    }
}
