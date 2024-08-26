package br.solutis.lista06.q3;

import br.solutis.lista06.q1.Animal;
import br.solutis.lista06.q1.Cachorro;
import br.solutis.lista06.q1.Cavalo;
import br.solutis.lista06.q1.Preguica;

public class Teste {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Thunder", 8);
        Animal preguica = new Preguica("Slow", 3);


        Veterinario veterinario = new Veterinario();


        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}
