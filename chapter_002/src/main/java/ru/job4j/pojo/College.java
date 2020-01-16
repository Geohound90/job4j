package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Pavlov Maksim");
        student.setGroup("P-106");
        student.setAdmission(new Date());

        System.out.println(student.getFio() + " enrolled to college in group № " + student.getGroup() + " : " + student.getAdmission());
    }
}
