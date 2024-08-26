package br.solutis.lista04.q2_q5;

import br.solutis.lista04.q1.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    private String nome;
    private String tipoAnimal;
    private double altura;
    private double peso;
    private String habitat;
    private int idade;

    protected int quantidadeComida;
    protected double distanciaPercorrida;
    protected int horasDormidas;

    public AnimalAB(String nome, String tipoAnimal, double altura, double peso, String habitat, int idade) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.altura = altura;
        this.peso = peso;
        this.habitat = habitat;
        this.idade = idade;
        this.quantidadeComida = 0;
        this.distanciaPercorrida = 0;
        this.horasDormidas = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }

    @Override
    public void comer(int quantidadeComida) {
        System.out.println("Animal está comendo!");
    }

    @Override
    public void moverse(double distanciaPercorrida) {
        System.out.println("Animal está se movendo!");
    }

    @Override
    public void dormir(int horasDormidas) {
        System.out.println("Animal está dormindo!");
    }
}
