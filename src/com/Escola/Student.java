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

    private String schoolOnEstic = " ";
    public String getSchoolOnEstic() { return schoolOnEstic; }
    public void setSchoolOnEstic(String schoolOnEstic) { this.schoolOnEstic = schoolOnEstic; }

    private String roomOnEstic = " ";
    public String getRoomOnEstic() { return roomOnEstic; }
    public void setRoomOnEstic(String roomOnEstic) { this.roomOnEstic = roomOnEstic; }

    public Student() {
    }
}
