package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        boolean ready = true;
    }

    @Override
    public void passengers(int number) {
        System.out.println("Количество пассажиров = " + number);

    }

    @Override
    public double fuel(double price) {
        int amount = 10;
        return amount * price;
    }
}
