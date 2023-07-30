package br.edu.unicesumar;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String dtNascimento;
    private int idade;

    public Pessoa(String nomeNovo, String dtNascNova, int idadeNova) {
        this.nome = nomeNovo;
        this.dtNascimento = dtNascNova;
        this.idade = idadeNova;
    }

    public Pessoa(String nomeNovo) {
        this.nome = nomeNovo;
    }

    public Pessoa(String dtNascNova, String nomeNovo) {
        this.dtNascimento = dtNascNova;
        this.nome = nomeNovo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDtNascimento() {
        return this.dtNascimento;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setNome(String nomeNovo) {
        this.nome = nomeNovo;
    }

    public void setDtNascimento(String dtNascNova) {
        this.dtNascimento = dtNascNova;
    }

    public void setIdade(int idadeNova) {
        this.idade = idadeNova;
    }
}
