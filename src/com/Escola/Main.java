package com.Escola;

import java.util.Scanner;

public class Main {

    private static int capacitySchool = 1;
    private static int capacityRoom = 1;
    private static int capacityStudent = 30;

    private static int properaLliureSchool = 0;
    private static int properaLliureRoom = 0;
    private static int properaLliureStudent = 0;

    private static School school[] = new School[capacitySchool];
    private static ClassRoom room[] = new ClassRoom[capacityRoom];
    private static Student student[] = new Student[capacityStudent];

    private static PassarMayus toMayus = new PassarMayus();
    private static CaracterCorrecte cc = new CaracterCorrecte();
    private static Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        boolean exit = false;
        boolean exitStudent = false;
        char mesAlumnes;
        boolean caracterIncorrecte = true;
        char mesAlumnesMayus = ' ';

        while (exit == false) {
            System.out.println("0. Tancar programa ");
            System.out.println("1. Donar alta una escola ");
            System.out.println("2. Donar alta un aula ");
            System.out.println("3. Donar alta un alumne ");
            System.out.println("4. Donar de baixa un alumne ");

            menu = teclat.nextInt();

            switch (menu) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    arraySchool();
                    break;
                case 2:
                    while (properaLliureRoom < capacityRoom) {
                        room[properaLliureRoom].altaAula();
                        properaLliureRoom++;
                    }
                    break;
                case 3:
                    while (properaLliureStudent < capacityStudent && exitStudent == false) {
                        student[properaLliureStudent].altaStudent();
                        properaLliureStudent++;

                        System.out.println("Vols matricular a més alumnes? Sí(s)/No(n)");
                        while (caracterIncorrecte == true) {
                            mesAlumnes = teclat.next().charAt(0);
                            mesAlumnesMayus = toMayus.cadenaAMayus(mesAlumnes);
                            caracterIncorrecte = cc.controladorChar(mesAlumnesMayus);
                        }
                        if (mesAlumnesMayus == 'N') {
                            exitStudent = true;
                        }
                    }
                    break;
                case 4:
                    while (properaLliureStudent < capacityStudent) {
                        student[properaLliureStudent].altaStudent();
                        properaLliureStudent++;
                    }
                    break;
            }
        }
    }

    public static void arraySchool() {

        String nameSchool;

        while (properaLliureSchool < capacitySchool) {
            System.out.println();

            System.out.print("Posa-li un nom a l'escola: ");
            nameSchool = teclat.nextLine();
            school[properaLliureSchool].setSchoolName(nameSchool);
            properaLliureSchool++;

            System.out.println();
        }
    }

    public static void arrayAula() {



    }

}
