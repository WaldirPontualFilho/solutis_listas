package br.solutis.lista04.q4;

import br.solutis.lista04.q3.Empregado;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    // Construtor
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Método para obter a ajuda de custo
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    // Método para definir a ajuda de custo
    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Redefinindo o método calcularSalario
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}