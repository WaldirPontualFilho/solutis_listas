package br.solutis.lista04.q6;

public class Teste {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Ana Silva", "Rua das Vendas", "(83) 98765-4321", 40, 2500, 15, 10000, 5);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Líquido: R$" + vendedor.calcularSalario());
    }
}