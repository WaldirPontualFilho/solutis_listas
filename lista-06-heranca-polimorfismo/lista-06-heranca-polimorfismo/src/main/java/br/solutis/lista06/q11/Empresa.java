package br.solutis.lista06.q11;


import br.solutis.lista06.q8.Gerente;
import br.solutis.lista06.q8.Supervisor;
import br.solutis.lista06.q8.Vendedor;


import java.util.Random;

public class Empresa {
    public static void main(String[] args) {
        int totalFuncionarios = 10;
        Funcionario[] funcionarios = new Funcionario[totalFuncionarios];
        Random random = new Random();

        // Percentuais
        int numGerentes = (int) (totalFuncionarios * 0.10);
        int numSupervisores = (int) (totalFuncionarios * 0.20);
        int numVendedores = totalFuncionarios - numGerentes - numSupervisores;

        // Criar funcionários com diferentes tipos de comissão
        for (int i = 0; i < totalFuncionarios; i++) {
            String nome = "Funcionário " + (i + 1);
            int codigoFuncional = i + 1;

            if (i < numGerentes) {
                funcionarios[i] = new Funcionario(nome, codigoFuncional, new Gerente());
            } else if (i < numGerentes + numSupervisores) {
                funcionarios[i] = new Funcionario(nome, codigoFuncional, new Supervisor());
            } else {
                funcionarios[i] = new Funcionario(nome, codigoFuncional, new Vendedor());
            }
        }

        // Calcular e exibir custos
        double custoTotal = 0.0;
        double custoGerentes = 0.0;
        double custoSupervisores = 0.0;
        double custoVendedores = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double rendaTotal = funcionario.calcularRendaTotal();
            custoTotal += rendaTotal;

            if (funcionario.getCodigoFuncional() <= numGerentes) {
                custoGerentes += rendaTotal;
            } else if (funcionario.getCodigoFuncional() <= numGerentes + numSupervisores) {
                custoSupervisores += rendaTotal;
            } else {
                custoVendedores += rendaTotal;
            }

            System.out.println(funcionario);
        }

        System.out.printf("Custo Total com Salários: R$ %.2f%n", custoTotal);
        System.out.printf("Custo Total com Salários de Gerentes: R$ %.2f%n", custoGerentes);
        System.out.printf("Custo Total com Salários de Supervisores: R$ %.2f%n", custoSupervisores);
        System.out.printf("Custo Total com Salários de Vendedores: R$ %.2f%n", custoVendedores);

    }
}
