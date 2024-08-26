package br.solutis.lista06.q2;

import br.solutis.lista06.q1.Animal;
import br.solutis.lista06.q1.Cachorro;
import br.solutis.lista06.q1.Cavalo;
import br.solutis.lista06.q1.Preguica;

public class Implementacao {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Thunder", 8);
        Animal preguica = new Preguica("Slow", 3);

        Animal[] animais = {cachorro, cavalo, preguica};

        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome() + ", Idade: " + animal.getIdade());
            animal.emitirSom();
        }
    }
}
