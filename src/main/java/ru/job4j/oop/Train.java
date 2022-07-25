package ru.job4j.oop;

public class Train implements Vehicle {
    String name;

    public Train(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " can move on rails");
    }

}
