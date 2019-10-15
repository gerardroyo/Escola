package com.Escola;

import java.util.Scanner;

public class Student {

    Scanner teclat = new Scanner(System.in);

    private String name = " ";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String enrollment;
    public String getEnrollment() {
        return enrollment;
    }
    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    private int progress = 0;
    public int getProgress() {
        return progress;
    }
    public void setProgress(int progress) {
        this.progress = progress;
    }

    public Student() {
    }

    public void altaStudent (){
        System.out.println();

        System.out.print("Posa-li un nom a l'alumne: ");
        this.name = teclat.nextLine();

        System.out.print("Posa-li una matrícula a l'alumne: ");
        this.enrollment = teclat.nextLine();

        System.out.println();
    }

}
