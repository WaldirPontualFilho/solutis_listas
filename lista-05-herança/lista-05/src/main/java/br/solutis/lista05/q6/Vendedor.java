package br.solutis.lista04.q6;

import br.solutis.lista04.q3.Empregado;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    // Construtor
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    // Métodos getters e setters
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * comissao / 100);
    }
}