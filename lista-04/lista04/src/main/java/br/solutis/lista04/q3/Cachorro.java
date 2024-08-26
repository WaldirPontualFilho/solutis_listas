package br.solutis.lista04.q3;

import br.solutis.lista04.q4_q5.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {


    public Cachorro(String nome, String tipoAnimal, double altura, double peso, String habitat, int idade, int quantidadePatas) {
        super(nome, tipoAnimal, altura, peso, habitat, idade, quantidadePatas);
    }

    @Override
    public void comer(int quantidadeComida) {
        setQuantidadeComida(getQuantidadeComida() + quantidadeComida);
        System.out.println("O cachorro comeu.");
    }

    @Override
    public void moverse(double distanciaPercorrida) {
        setDistanciaPercorrida(getDistanciaPercorrida() + distanciaPercorrida);
        System.out.println("O cachorro correu.");
    }

    @Override
    public void dormir(int horasDormidas) {
        setHorasDormidas(getHorasDormidas() + horasDormidas);
        System.out.println("O cachorro dormiu.");
    }
}
