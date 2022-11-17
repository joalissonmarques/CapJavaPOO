package org.example;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(123, "Joalisson");
        conta.setSaldo(100);
        conta.deposito(-1);
        conta.saque(10000);
        conta.deposito(50);
        System.out.println(conta.toString());
        conta.saque(30);
        System.out.println(conta.toString());
        conta.alterarNome("Jorge");
        System.out.println(conta.toString());
    }
}