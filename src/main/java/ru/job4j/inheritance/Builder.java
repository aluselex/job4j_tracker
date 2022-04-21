package ru.job4j.inheritance;

import java.util.Date;

public class Builder extends Engineer {

    public Builder(String name, String surname, String education, Date birthday, String speciality) {
        super(name, surname, education, birthday, speciality);
    }

    public boolean employed(boolean canDesign) {
        return canDesign;
    }
}

