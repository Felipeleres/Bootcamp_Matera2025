package org.example.exception;

public class TesteExececao {

    public static void main(String [] args) throws Exception{

        Conta conta = new Conta();

        conta.setSaldo(1000.00);
        conta.setTaxaOperacao(0.5);

        try{
            conta.sacar(300.00);
        } catch(ExcecaoValorParaSaqueZerado e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Saldo: "+ conta.getSaldo());
        }

    }
}


