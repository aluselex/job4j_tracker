package ru.job4j.pojo;

import java.time.LocalDate;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Сидоров Иван Петрович");
        student.setGroup(8432);
        student.setAdmission(LocalDate.of(1998, 9, 1));
        System.out.println("ФИО: " + student.getName());
        System.out.println("Группа: " + student.getGroup());
        System.out.println("Дата поступления: " + student.getAdmission());
    }
}
