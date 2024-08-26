package br.solutis.lista06.q6;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double rendaBasica = 1000.00;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public double calcularRendaTotal() {
        return rendaBasica;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código Funcional: " + codigoFuncional);
        System.out.printf("Renda Total: R$ %.2f%n", calcularRendaTotal());
    }
}
