package org.example.ExemploEqualsIgual;

public class TesteEqualsEIgualIgual {

    public static void main(String[] args) {

        String nome1 = "Felipe";
        String nome2 = "Felipe";
        String nome3 = new String("Felipe");
        String nome4 = "felipe";

        System.out.println("nome1 == nome2 = "+(nome1 == nome2));
        System.out.println("nome1 == nome3 = "+(nome1 == nome3));
        System.out.println("nome1.equals(nome2): "+ nome1.equals(nome2));
        System.out.println("nome1.equals(nome3): "+ nome1.equals(nome3));
        System.out.println("nome1.equalsIgnoreCase: " + nome1.equalsIgnoreCase(nome4));
// .equals compara o conteúdo dos dois objetos.
    }


}
