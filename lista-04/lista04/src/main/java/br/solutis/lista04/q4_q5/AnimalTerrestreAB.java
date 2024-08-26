package br.solutis.lista04.q4_q5;

import br.solutis.lista04.q2_q5.AnimalAB;

public class AnimalTerrestreAB extends AnimalAB {
    private int quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, double altura, double peso, String habitat, int idade, int quantidadePatas) {
        super(nome, tipoAnimal, altura, peso, habitat, idade);
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

}
