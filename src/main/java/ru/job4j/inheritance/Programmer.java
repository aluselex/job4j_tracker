package ru.job4j.inheritance;

import java.util.Date;

public class Programmer extends Engineer {

    private String language;

    public Programmer(String name, String surname, String education, Date birthday, String  speciality, String language) {
        super(name, surname, education, birthday, speciality);
        this.language = language;
    }

    public boolean employed(boolean canCode) {
        return canCode;
    }
}
