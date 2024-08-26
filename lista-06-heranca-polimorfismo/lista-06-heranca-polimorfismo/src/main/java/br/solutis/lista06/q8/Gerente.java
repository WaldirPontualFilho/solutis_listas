package br.solutis.lista06.q8;

public class Gerente extends Comissao {
    public Gerente() {
        this.adicional = 1500.00;
    }

    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase + adicional;
    }
}
