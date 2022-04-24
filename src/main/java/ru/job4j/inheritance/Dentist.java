package ru.job4j.inheritance;

import java.util.Date;

public class Dentist extends Doctor  {
    private int admissionPrice;

    public Dentist(String name, String surname, String education, Date birthday, String speciality, int admissionPrice) {
        super(name, surname, education, birthday, speciality);
        this.admissionPrice = admissionPrice;
    }

    public boolean isCaries(boolean found) {
        return found;
    }
}

