package br.solutis.lista06.q3;

import br.solutis.lista06.q1.Animal;

public class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando " + animal.getNome() + "...");
        animal.emitirSom();
    }
}

