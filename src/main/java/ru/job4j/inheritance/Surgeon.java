package ru.job4j.inheritance;

import java.util.Date;

public class Surgeon extends Doctor {

    private int expAges;

    public Surgeon(String name, String surname, String education, Date birthday, String speciality, int expAges) {
        super(name, surname, education, birthday, speciality);
        this.expAges = expAges;
    }

    public boolean needTreatment(boolean sick) {
        return sick;
    }
}
