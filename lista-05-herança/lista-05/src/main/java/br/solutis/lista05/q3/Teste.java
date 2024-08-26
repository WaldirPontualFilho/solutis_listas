package br.solutis.lista04.q3;

public class Teste {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João da Silva", "Rua de Tal", "(83) 98765-4321", 10, 5000, 15);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Líquido: R$" + empregado.calcularSalario());
    }
}