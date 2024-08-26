package br.solutis.lista04.q1;

public class Pessoa {
    // Atributos privados (encapsulados)
    private String nome;
    private String endereco;
    private String telefone;

    // Construtor padrão (sem parâmetros)
    public Pessoa() {
    }

    // Construtor com todos os parâmetros
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Construtor com alguns parâmetros
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = "Não informado";
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}