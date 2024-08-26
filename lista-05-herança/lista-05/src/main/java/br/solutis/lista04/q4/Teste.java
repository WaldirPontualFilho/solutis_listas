package br.solutis.lista04.q4;

public class Teste {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Maria Silva", "Rua Central", "(83) 98765-4321", 20, 8000, 20, 2000);

        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Líquido: R$" + administrador.calcularSalario());
    }
}