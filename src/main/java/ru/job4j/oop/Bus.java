package ru.job4j.oop;

public class Bus implements Vehicle {
    private String name;

    public Bus(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " can use a highway");
    }
}
