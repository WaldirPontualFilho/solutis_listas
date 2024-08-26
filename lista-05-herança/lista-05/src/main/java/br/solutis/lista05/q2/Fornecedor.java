package br.solutis.lista04.q2;
import br.solutis.lista04.q1.Pessoa;

public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    // Construtor com todos os parâmetros
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }


    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    // Getters e setters para os novos atributos
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
