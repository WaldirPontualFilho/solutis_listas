package br.solutis.lista04.q4_q5;

public class Peixe extends AnimalMarinhoAB{

    public Peixe(String nome, String tipoAnimal, double altura, double peso, String habitat, int idade, int profundidadeMaxima) {
        super(nome, tipoAnimal, altura, peso, habitat, idade, profundidadeMaxima);
    }

    @Override
    public void comer(int quantidadeComida) {
        setQuantidadeComida(getQuantidadeComida() + quantidadeComida);
        System.out.println("O peixe comeu!");
    }

    @Override
    public void moverse(double distanciaPercorrida) {
        setDistanciaPercorrida(getDistanciaPercorrida() + distanciaPercorrida);
        System.out.println("O peixe nadou!");
    }

    @Override
    public void dormir(int horasDormidas) {
        setHorasDormidas(getHorasDormidas() + horasDormidas);
        System.out.println("O peixe dormiu!");
    }
}
