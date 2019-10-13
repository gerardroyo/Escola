package com.Escola;

import java.util.Scanner;

public class Main {

    private static int capacitySchool = 1;
    private static int capacityRoom = 1;
    private static int capacityStudent = 30;

    private static School school[] = new School[capacitySchool];
    private static ClassRoom room[] = new ClassRoom[capacityRoom];
    private static Student student[] = new Student[capacityStudent];

    private static int properaLliureSchool = 0;
    private static int properaLliureRoom = 0;
    private static int properaLliureStudent = 0;

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int menu;
        boolean exit = false;

        while (exit == false) {
            System.out.println("0. Tancar programa ");
            System.out.println("1. Donar alta una escola ");
            System.out.println("2. Donar alta un aula ");

            menu = teclat.nextInt();

            switch (menu) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    while (properaLliureSchool < capacitySchool) {
                        school[properaLliureSchool].altaEscola();
                        properaLliureSchool++;
                    }
                    break;
                case 2:
                    while (properaLliureRoom < capacityRoom) {
                        school[properaLliureRoom].altaEscola();
                        properaLliureRoom++;
                    }
                    break;
            }
        }
    }

    public static void arraySchool() {



    }

    public static void arrayAula() {



    }

}
