package br.solutis.lista06.q8;

public class Supervisor extends Comissao {
    public Supervisor() {
        this.adicional = 600.00;
    }

    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase + adicional;
    }
}