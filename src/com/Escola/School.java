package com.Escola;

public class School {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String schoolName;
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

    public School(String name, String schoolName, int capacitat) {
        this.name = name;
        this.schoolName = schoolName;
        this.capacitat = capacitat;
    }
}
