package br.solutis.lista06.q4;

import br.solutis.lista06.q1.Animal;
import br.solutis.lista06.q1.Cachorro;
import br.solutis.lista06.q1.Cavalo;
import br.solutis.lista06.q1.Preguica;

public class Teste {
    public static void main(String[] args) {

        Animal cachorro1 = new Cachorro("Rex", 5);
        Animal cavalo1 = new Cavalo("Thunder", 8);
        Animal preguica1 = new Preguica("Slow", 3);
        Animal cachorro2 = new Cachorro("Bolt", 4);
        Animal cavalo2 = new Cavalo("Spirit", 7);
        Animal preguica2 = new Preguica("Lazy", 2);
        Animal cachorro3 = new Cachorro("Buddy", 6);
        Animal cavalo3 = new Cavalo("Shadowfax", 10);
        Animal preguica3 = new Preguica("Dreamer", 4);
        Animal cachorro4 = new Cachorro("Max", 3);


        Zoologico zoologico = new Zoologico();


        zoologico.adicionarAnimal(0, cachorro1);
        zoologico.adicionarAnimal(1, cavalo1);
        zoologico.adicionarAnimal(2, preguica1);
        zoologico.adicionarAnimal(3, cachorro2);
        zoologico.adicionarAnimal(4, cavalo2);
        zoologico.adicionarAnimal(5, preguica2);
        zoologico.adicionarAnimal(6, cachorro3);
        zoologico.adicionarAnimal(7, cavalo3);
        zoologico.adicionarAnimal(8, preguica3);
        zoologico.adicionarAnimal(9, cachorro4);


        zoologico.percorrerJaulas();
    }
}
