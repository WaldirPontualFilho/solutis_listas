package br.solutis.lista06.q6;

public class Teste {
    public static void main(String[] args) {
        // Funcionário que não estudou
        Funcionario func1 = new Funcionario("João", 101);
        func1.exibirInformacoes();

        System.out.println();

        // Funcionário que concluiu o Ensino Básico
        FuncionarioEnsinoBasico func2 = new FuncionarioEnsinoBasico("Maria", 102, "Escola ABC");
        func2.exibirInformacoes();

        System.out.println();

        // Funcionário que concluiu o Ensino Médio
        FuncionarioEnsinoMedio func3 = new FuncionarioEnsinoMedio("Pedro", 103, "Escola ABC", "Escola XYZ");
        func3.exibirInformacoes();

        System.out.println();

        // Funcionário que concluiu a Graduação
        FuncionarioGraduacao func4 = new FuncionarioGraduacao("Ana", 104, "Escola ABC", "Escola XYZ", "Universidade DEF");
        func4.exibirInformacoes();
    }
}
