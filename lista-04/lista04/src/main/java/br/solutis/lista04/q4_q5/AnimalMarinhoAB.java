package br.solutis.lista04.q4_q5;

import br.solutis.lista04.q2_q5.AnimalAB;

public class AnimalMarinhoAB extends AnimalAB {
    private int profundidadeMaxima;

    public AnimalMarinhoAB(String nome, String tipoAnimal, double altura, double peso, String habitat, int idade, int profundidadeMaxima) {
        super(nome, tipoAnimal, altura, peso, habitat, idade);
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public int getProfundidadeMaxima() {
        return profundidadeMaxima;
    }

    public void setProfundidadeMaxima(int profundidadeMaxima) {
        this.profundidadeMaxima = profundidadeMaxima;
    }
}
