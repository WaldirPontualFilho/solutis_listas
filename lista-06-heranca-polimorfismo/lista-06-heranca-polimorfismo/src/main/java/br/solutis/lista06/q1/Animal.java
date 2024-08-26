package br.solutis.lista06.q1;

public abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void emitirSom();

    // Método abstrato para o comportamento específico de cada animal
    public abstract void acaoEspecifica();
}

