package br.solutis.lista04.q2;
public class Teste {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Empresa Tal Inc.", "Rua das Indústrias", "(83) 98765-4321", 10000, 5000);

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}