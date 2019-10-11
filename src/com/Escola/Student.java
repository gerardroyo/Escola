package com.Escola;

public class Student {

    private String name = "";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String enrollment = "";
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

    public Student(String name, String enrollment, int progress) {
        this.name = name;
        this.enrollment = enrollment;
        this.progress = progress;
    }
}
