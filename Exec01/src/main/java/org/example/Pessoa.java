package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    /*Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de
    nascimento e altura. Crie os métodos públicos necessários para getters e setters e também
    um método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade da
    pessoa.*/
    //Atributos
    private String nome;
    private LocalDate dataNascimento;
    private float altura;

    //constructor
    public Pessoa(String nome, LocalDate dataNascimento, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        //Tem que fazer tratamento de data ser menor que atual.
        this.altura = altura;
        //Tratamento em altura que não pode ser menor que 0.
    }

    public int calculaIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome + "\n Altura: " + altura + "\nIdade: " + calculaIdade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
