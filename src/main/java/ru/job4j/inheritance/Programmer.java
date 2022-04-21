package ru.job4j.inheritance;

import java.util.Date;

public class Programmer extends Engineer {

    public Programmer(String name, String surname, String education, Date birthday, String  speciality) {
        super(name, surname, education, birthday, speciality);
    }

    public boolean employed(boolean canCode) {
        return canCode;
    }
}
