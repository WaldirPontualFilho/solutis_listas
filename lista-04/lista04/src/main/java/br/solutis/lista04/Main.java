package br.solutis.lista04;

import br.solutis.lista04.q3.Cachorro;
import br.solutis.lista04.q4_q5.Peixe;
import br.solutis.lista04.q4_q5.Pombo;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Toby","Terrestre", 0.25, 10,"Casa", 5,4);
        cachorro1.setDistanciaPercorrida(12);
        cachorro1.moverse(12);
        System.out.println(cachorro1.getDistanciaPercorrida());

        Peixe peixe1 = new Peixe("peixe", "Aquático",0.05,0.05,"Mar", 3,50);
        peixe1.setHorasDormidas(5);
        peixe1.dormir(5);
        System.out.println(peixe1.getHorasDormidas());

        Pombo pombo1 = new Pombo("","Ave", 0.20, 0.50, "Céu", 2, 2,0.9);
        pombo1.setQuantidadeComida(20);
        pombo1.comer(30);
        System.out.println(pombo1.getQuantidadeComida());



    }
}