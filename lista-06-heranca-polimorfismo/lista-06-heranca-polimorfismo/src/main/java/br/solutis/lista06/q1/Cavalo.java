package br.solutis.lista06.q1;

public class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo está relinchando.");
    }

    @Override
    public void acaoEspecifica() {
        System.out.println("O cavalo está correndo.");
    }
}
