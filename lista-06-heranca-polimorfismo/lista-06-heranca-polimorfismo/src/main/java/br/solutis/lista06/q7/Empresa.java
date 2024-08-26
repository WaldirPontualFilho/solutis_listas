package br.solutis.lista06.q7;

import br.solutis.lista06.q6.Funcionario;
import br.solutis.lista06.q6.FuncionarioEnsinoBasico;
import br.solutis.lista06.q6.FuncionarioEnsinoMedio;
import br.solutis.lista06.q6.FuncionarioGraduacao;

import java.util.Random;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        Random random = new Random();

        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoGraduacao = 0;

        for (int i = 0; i < funcionarios.length; i++) {
            int escolaridade = random.nextInt(10);
            if (escolaridade < 4) {
                funcionarios[i] = new FuncionarioEnsinoBasico("Funcionario " + (i + 1), i + 1, "Escola Básica " + (i + 1));
                custoEnsinoBasico += funcionarios[i].calcularRendaTotal();
            } else if (escolaridade < 8) {
                funcionarios[i] = new FuncionarioEnsinoMedio("Funcionario " + (i + 1), i + 1, "Escola Básica " + (i + 1), "Escola Média " + (i + 1));
                custoEnsinoMedio += funcionarios[i].calcularRendaTotal();
            } else {
                funcionarios[i] = new FuncionarioGraduacao("Funcionario " + (i + 1), i + 1, "Escola Básica " + (i + 1), "Escola Média " + (i + 1), "Universidade " + (i + 1));
                custoGraduacao += funcionarios[i].calcularRendaTotal();
            }
            custoTotal += funcionarios[i].calcularRendaTotal();
        }

        System.out.printf("Custo total da empresa com salários: R$ %.2f%n", custoTotal);
        System.out.printf("Custo total com funcionários de Ensino Básico: R$ %.2f%n", custoEnsinoBasico);
        System.out.printf("Custo total com funcionários de Ensino Médio: R$ %.2f%n", custoEnsinoMedio);
        System.out.printf("Custo total com funcionários de Graduação: R$ %.2f%n", custoGraduacao);
    }
}
