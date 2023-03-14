package br.com.dio;

import br.com.model.Carro;
import br.com.model.Moto;

public class FirstProgram {
    public static void main(String[] args) {
        Moto moto = new Moto();
        Carro carro = new Carro("Fiat", "Preto", 859.66);
        System.out.println(moto);
    }
}