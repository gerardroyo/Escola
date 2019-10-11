package com.Escola;

public class Pais {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private School[] schoolList;
    public School[] getSchoolList() {
        return schoolList;
    }
    public void setSchoolList(School[] schoolList) {
        this.schoolList = schoolList;
    }

    private int capacitat;
    public int getCapacitat() {
        return capacitat;
    }
    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
        schoolList = new School[this.capacitat];
    }

    public void crearEscola() {
        School school1 = new School();
    }
}
