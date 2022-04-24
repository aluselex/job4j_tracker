package ru.job4j.inheritance;

import java.util.Date;

public class Builder extends Engineer {

    private boolean dutyTrip;

    public Builder(String name, String surname, String education, Date birthday, String speciality, boolean dutyTrip) {
        super(name, surname, education, birthday, speciality);
        this.dutyTrip = dutyTrip;
    }

    public boolean employed(boolean canDesign) {
        return canDesign;
    }
}

