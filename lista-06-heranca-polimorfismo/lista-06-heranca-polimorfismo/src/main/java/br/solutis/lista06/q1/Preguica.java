package br.solutis.lista06.q1;

public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça está fazendo som.");
    }

    @Override
    public void acaoEspecifica() {
        System.out.println("A preguiça está subindo na árvore.");
    }
}
