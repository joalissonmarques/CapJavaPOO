package org.example;

public class ContaCorrente {
    /*Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos: número
    da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No
    construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.*/

    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }

    public void alterarNome(String novoNome) {
        this.nomeCorrentista = novoNome;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor não pode ser negativo");
        }
    }

    public void saque(double valor) {
        if (this.saldo > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo não pode ser negativado");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numeroConta=" + numeroConta +
                ", nomeCorrentista='" + nomeCorrentista + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
