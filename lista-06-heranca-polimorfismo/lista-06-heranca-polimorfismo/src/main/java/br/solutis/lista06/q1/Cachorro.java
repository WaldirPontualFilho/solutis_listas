package br.solutis.lista06.q1;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo.");
    }

    @Override
    public void acaoEspecifica() {
        System.out.println("O cachorro está correndo.");
    }
}
