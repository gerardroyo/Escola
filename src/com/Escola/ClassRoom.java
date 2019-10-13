package com.Escola;

import java.util.Scanner;

public class ClassRoom {

    Scanner teclat = new Scanner(System.in);

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private Student[] StudentList;
    public Student[] getStudentList() {
        return StudentList;
    }
    public void setStudentList(Student[] studentList) {
        StudentList = studentList;
    }

    private int capacitat;
    public int getCapacitat() {
        return capacitat;
    }
    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
        StudentList = new Student[this.capacitat];
    }

    public ClassRoom() {
    }

    public void altaAula(){
        System.out.println();
        System.out.print("Posa-li un nom a l'aula: ");
        this.name = teclat.nextLine();
        System.out.println();
    }

}
