package br.solutis.lista04.q4_q5;

import br.solutis.lista04.q2_q5.AnimalAB;

public class AnimalVoadorAB extends AnimalAB {
    private int quantidadeAsas;
    private double envergaduraAsas;

    public AnimalVoadorAB(String nome, String tipoAnimal, double altura, double peso, String habitat, int idade, int quantidadeAsas, double envergaduraAsas) {
        super(nome, tipoAnimal, altura, peso, habitat, idade);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsas = envergaduraAsas;
    }

    public int getQuantidadeAsas() {
        return quantidadeAsas;
    }

    public void setQuantidadeAsas(int quantidadeAsas) {
        this.quantidadeAsas = quantidadeAsas;
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }
}
