package com.Escola;

import java.util.Scanner;

public class School {

    Scanner teclat = new Scanner(System.in);

    private String schoolName = "Pia Mataro";
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    private ClassRoom[] classRoomList;
    public ClassRoom[] getSchoolList() {
        return classRoomList;
    }
    public void setSchoolList(ClassRoom[] schoolList) {
        this.classRoomList = schoolList;
    }

    private int capacitat;
    public int getCapacitat() {
        return capacitat;
    }
    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
        classRoomList = new ClassRoom[this.capacitat];
    }

    public School() {
    }
}
