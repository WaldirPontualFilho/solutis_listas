package br.solutis.lista04.q5;

public class Teste {
    public static void main(String[] args) {
        Operario operario = new Operario("João Silva", "Rua da Fábrica", "(19) 98765-4321", 30, 3000, 10, 5000, 15);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Líquido: R$" + operario.calcularSalario());
    }
}