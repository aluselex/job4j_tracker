package ru.job4j.inheritance;

import java.util.Date;

public class Doctor extends  Profession {
    private String speciality;

    public Doctor(String name, String surname, String education, Date birthday, String speciality) {
        super(name, surname, education, birthday);
        this.speciality = speciality;
    }

    public Disease findDoctor(Disease doctor) {
        return doctor;
    }
}
