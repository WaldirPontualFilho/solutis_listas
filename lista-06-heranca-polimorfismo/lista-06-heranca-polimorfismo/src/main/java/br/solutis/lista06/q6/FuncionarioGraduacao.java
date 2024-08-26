package br.solutis.lista06.q6;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduacao(String nome, int codigoFuncional, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 2.00;  // Acrescenta 100% sobre a renda do nível anterior
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Universidade: " + universidade);
    }
}