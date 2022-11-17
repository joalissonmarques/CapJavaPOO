package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jorge", LocalDate.of(1995, 11, 03), 1.80f);
        pessoa.imprimirDados();
    }
}