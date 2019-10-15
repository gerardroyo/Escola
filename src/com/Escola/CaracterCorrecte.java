package com.Escola;

public class CaracterCorrecte {

    public boolean controladorChar(char caracterChar) {
        boolean entradaCorrecte = true;

        if (caracterChar == 'S' || caracterChar == 'N') {
            entradaCorrecte = false;
        }
        else {
            System.out.println("No has escrit be la instrucció, torna-hi: ");
        }
        return entradaCorrecte;
    }

}
