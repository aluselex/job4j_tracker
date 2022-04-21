package ru.job4j.inheritance;

import java.util.Date;

public class Engineer extends Profession {
    private String speciality;

    public Engineer(String name, String surname, String education, Date birthday, String speciality) {
        super(name, surname, education, birthday);
        this.speciality = speciality;
    }

    public Action profile(Action engineer) {
        return engineer;
    }
}
