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


        while (exit == false) {
            System.out.println("0. Tancar programa ");
            System.out.println("1. Donar alta una escola ");
            System.out.println("2. Donar alta un aula ");
            System.out.println("3. Donar alta un alumne ");
            System.out.println("4. Donar de baixa un alumne ");
            System.out.println("5. Fer progresar un alumne/a ");

            menu = teclat.nextInt();

            switch (menu) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    CreateSchool();
                    break;
                case 2:
                    CreateAula();
                    break;
                case 3:
                    CreateStudent();
                    break;
                case 4:
                    DeleteStudent();
                    break;
                case 5:
                    FerProgressar();
                    break;
                case 6:
                    ModificarAlumne();
                    break;
            }
        }
    }

    public static void CreateSchool() {

        String nameSchool;

        while (properaLliureSchool < capacitySchool) {
            System.out.println();

            System.out.print("Posa-li un nom a l'escola: ");
            nameSchool = teclat.next();
            teclat.nextLine();
            school[properaLliureSchool]= new School();
            school[properaLliureSchool].setSchoolName(nameSchool);
            properaLliureSchool++;

            System.out.println();
        }
    }

    public static void CreateAula() {

        String nameRoom;

        while (properaLliureRoom < capacityRoom) {
            System.out.print("Posa-li un nom a l'aula: ");
            nameRoom = teclat.next();
            room[properaLliureSchool]= new ClassRoom();
            room[properaLliureRoom].setName(nameRoom);
            properaLliureRoom++;
        }

    }

    public static void CreateStudent() {

        String nameStudent;
        String enrollmentStudent;
        boolean exitStudent = false;
        char mesAlumnes;
        boolean caracterIncorrecte = true;
        char mesAlumnesMayus = ' ';

        while (properaLliureStudent < capacityStudent && exitStudent == false) {

            System.out.print("Posa-li un nom a l'alumne/a: ");
            nameStudent = teclat.next();
            teclat.nextLine();

            System.out.println("Intodueix la matrícula del nou alumne/a: ");
            enrollmentStudent = teclat.next();
            teclat.nextLine();

            student[properaLliureStudent]= new Student();
            student[properaLliureStudent].setName(nameStudent);
            student[properaLliureStudent].setEnrollment(enrollmentStudent);
            properaLliureStudent++;

            System.out.println("Vols matricular a més alumnes? Sí(s)/No(n)");
            caracterIncorrecte = true;
            while (caracterIncorrecte == true) {
                mesAlumnes = teclat.next().charAt(0);
                mesAlumnesMayus = toMayus.cadenaAMayus(mesAlumnes);
                caracterIncorrecte = cc.controladorChar(mesAlumnesMayus);
                if (mesAlumnesMayus == 'N') {
                    exitStudent = true;
                }
            }

        }

    }

    public static void DeleteStudent() {

        String nameStudent;
        String enrollmentStudent;
        boolean exitStudent = false;
        char mesAlumnes;
        boolean caracterIncorrecte;
        char mesAlumnesMayus = ' ';

        System.out.println("Intodueix la matrícula de l'alumne/a a donar de baixa: ");
        enrollmentStudent = teclat.next();
        teclat.nextLine();

        while (exitStudent == false) {

            for (int i = 0; i < capacityStudent; i++) {
                if (student[i].getEnrollment().equals(enrollmentStudent) && student[i] != null) {
                    student[i] = null;
                    i = capacityStudent;
                } else {
                    System.out.println("L'alumne no existeix");
                }
            }

            System.out.println("Vols donar de baixa a més alumnes? Sí(s)/No(n)");
            caracterIncorrecte = true;
            while (caracterIncorrecte == true) {
                mesAlumnes = teclat.next().charAt(0);
                mesAlumnesMayus = toMayus.cadenaAMayus(mesAlumnes);
                caracterIncorrecte = cc.controladorChar(mesAlumnesMayus);
                if (mesAlumnesMayus == 'N') {
                    exitStudent = true;
                }
            }
        }
    }

    public static void FerProgressar() {

        String nameStudent;
        String enrollmentStudent;
        int progressStudent;
        boolean exitStudent = false;
        char mesAlumnes;
        boolean caracterIncorrecte;
        char mesAlumnesMayus = ' ';

        System.out.println("Intodueix la matrícula de l'alumne/a per modificar el progress: ");
        enrollmentStudent = teclat.next();
        teclat.nextLine();

        System.out.println("AVIS! Si la suma del progress arriba a 10, l'alumne es donara de baixa en el programa automaticament.");

        System.out.println("Introdueix el progress de l'alume/a anteriorment indicat: ");
        progressStudent = teclat.nextInt();
        teclat.nextLine();

        for (int i = 0; i < capacityStudent; i++) {
            if (student[i].getEnrollment().equals(enrollmentStudent) && student[i] != null) {
                if (progressStudent >= 1 && progressStudent <= 5 && student[i].getProgress() + progressStudent <= 10) {
                    student[i].setProgress(student[i].getProgress() + progressStudent);
                } else if (!(student[i].getProgress() + progressStudent <= 10)){
                    System.out.println("El progrés no pot sumar més de 10!");
                } else if (!(progressStudent >= 1 && progressStudent <= 5)) {
                    System.out.println("El progrés a introduir ha d'estar entre 1 i 5!");
                }

                i = capacityStudent;
            } else {
                System.out.println("L'alumne no existeix");
            }

            if (student[i].getProgress() == 10) {
                student[i] = null;
                System.out.println("S'ha donat de baixa l'alumne " + student[i].getName());
            }
        }
    }

    public static void ModificarAlumne() {

        String enrollmentStudent;

        System.out.println("Intodueix la matrícula de l'alumne/a per modificar: ");
        enrollmentStudent = teclat.next();
        teclat.nextLine();

        for (int i = 0; i < capacityStudent; i++) {
            if (student[i].getEnrollment().equals(enrollmentStudent) && student[i] != null) {
                System.out.println("Nom:" + student[i].getName());
                System.out.println("Matrícula:" + student[i].getEnrollment());
                i = capacityStudent;
            } else {
                System.out.println("L'alumne no existeix");
            }

            System.out.println("0. Per modificar el Nom");
            System.out.println("1. Per modificar la Matrícula");
            int menuModificar = teclat.nextInt();

            switch (menuModificar) {
                case 0:
                    System.out.println("Introdueix el noou nom: ");
                    String newName = teclat.next();
                    break;
                case 1:
                    System.out.println("Introdueix la nova matrícula: ");
                    break;
            }

        }


    }

}
