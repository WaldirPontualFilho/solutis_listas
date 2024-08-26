package br.solutis.lista04.q5;

import br.solutis.lista04.q3.Empregado;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    // Construtor
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    // Métodos getters e setters
    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * comissao / 100);
    }
}