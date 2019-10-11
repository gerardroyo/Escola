package com.Escola;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Pais espanyita = new Pais();
        char menuSchool;

        System.out.println("1. Donar alta una escola: ");
        System.out.println("2. Mostrar escoles: ");
        menuSchool = teclat.next().charAt(0);

        switch (menuSchool) {
            case 1:
                espanyita.crearEscola();

                break;
            case 2:


                break;
        }

    }
}
