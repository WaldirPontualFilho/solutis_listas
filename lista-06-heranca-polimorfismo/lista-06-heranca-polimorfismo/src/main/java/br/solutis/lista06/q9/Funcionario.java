package br.solutis.lista06.q9;

import br.solutis.lista06.q8.Comissao;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double rendaBasica = 1000.00;
    private Comissao comissao; // Novo atributo para a comissão

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao; // Inicializa o atributo com comissão
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    // Atualizado para considerar a comissão
    public double calcularRendaTotal() {
        double rendaComComissao = rendaBasica;
        if (comissao != null) {
            rendaComComissao += comissao.getAdicional();
        }
        return rendaComComissao;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código Funcional: " + codigoFuncional);
        System.out.printf("Renda Total: R$ %.2f%n", calcularRendaTotal());
    }
}
