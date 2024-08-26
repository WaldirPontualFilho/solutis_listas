package br.solutis.lista06.q6;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaBasico;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasico) {
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
    }

    public String getEscolaBasico() {
        return escolaBasico;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.10;  // Acrescenta 10%
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Escola do Ensino Básico: " + escolaBasico);
    }
}
