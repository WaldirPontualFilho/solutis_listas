package br.solutis.lista06.q4;

import br.solutis.lista06.q1.Animal;
import br.solutis.lista06.q1.Cachorro;
import br.solutis.lista06.q1.Cavalo;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {

        jaulas = new Animal[10];
    }


    public void adicionarAnimal(int jaula, Animal animal) {
        if (jaula >= 0 && jaula < jaulas.length) {
            jaulas[jaula] = animal;
        } else {
            System.out.println("Número de jaula inválido.");
        }
    }


    public void percorrerJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            Animal animal = jaulas[i];
            if (animal != null) {
                System.out.println("Jaula " + (i + 1) + ": " + animal.getNome() + " está emitindo som.");
                animal.emitirSom();
                if (animal instanceof Cachorro || animal instanceof Cavalo) {
                    animal.acaoEspecifica(); // Correr se for Cachorro ou Cavalo
                }
            } else {
                System.out.println("Jaula " + (i + 1) + " está vazia.");
            }
        }
    }
}
