package br.solutis.lista06.q5;

public class Teste {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("João", 101);
        func1.exibirInformacoes();

        System.out.println();


        FuncionarioEnsinoBasico func2 = new FuncionarioEnsinoBasico("Maria", 102, "Escola ABC");
        func2.exibirInformacoes();

        System.out.println();


        FuncionarioEnsinoMedio func3 = new FuncionarioEnsinoMedio("Pedro", 103, "Escola ABC", "Escola XYZ");
        func3.exibirInformacoes();

        System.out.println();


        FuncionarioGraduacao func4 = new FuncionarioGraduacao("Ana", 104, "Escola ABC", "Escola XYZ", "Universidade DEF");
        func4.exibirInformacoes();
    }
}