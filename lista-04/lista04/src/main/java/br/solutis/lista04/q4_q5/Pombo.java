package br.solutis.lista04.q4_q5;

public class Pombo extends AnimalVoadorAB{


    public Pombo(String nome, String tipoAnimal, double altura, double peso, String habitat, int idade, int quantidadeAsas, double envergaduraAsas) {
        super(nome, tipoAnimal, altura, peso, habitat, idade, quantidadeAsas, envergaduraAsas);
    }

    @Override
    public void comer(int quantidadeComida) {
        setQuantidadeComida(getQuantidadeComida() + quantidadeComida);
        System.out.println("O pombo comeu.");
    }

    @Override
    public void moverse(double distanciaPercorrida) {
        setDistanciaPercorrida(getDistanciaPercorrida() + distanciaPercorrida);
        System.out.println("O pombo voou.");
    }

    @Override
    public void dormir(int horasDormidas) {
        setHorasDormidas(getHorasDormidas() + horasDormidas);
        System.out.println("O pombo dormiu.");
    }
}
