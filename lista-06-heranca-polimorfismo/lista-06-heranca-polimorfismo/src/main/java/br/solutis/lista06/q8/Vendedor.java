package br.solutis.lista06.q8;

public class Vendedor extends Comissao {
    public Vendedor() {
        this.adicional = 250.00;
    }

    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase + adicional;
    }
}
