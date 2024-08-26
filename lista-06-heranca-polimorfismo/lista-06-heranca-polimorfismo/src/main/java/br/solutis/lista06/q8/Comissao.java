package br.solutis.lista06.q8;

public abstract class Comissao {
    protected double adicional;

    public double getAdicional() {
        return adicional;
    }

    // Método abstrato para calcular o salário com comissão
    public abstract double calcularSalario(double salarioBase);
}

