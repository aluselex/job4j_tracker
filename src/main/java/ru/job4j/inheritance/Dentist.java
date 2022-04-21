package ru.job4j.inheritance;

import java.util.Date;

public class Dentist extends Doctor  {
    private boolean caries;

    public Dentist(String name, String surname, String education, Date birthday, String speciality) {
        super(name, surname, education, birthday, speciality);
    }

    public boolean isCaries(boolean found) {
        return found;
    }
}

