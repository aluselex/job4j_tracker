package ru.job4j.oop;

public class Airplane implements Vehicle {
    String name;

    public Airplane(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " can fly");
    }
}
