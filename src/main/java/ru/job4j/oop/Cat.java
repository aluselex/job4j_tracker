package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meal) {
        this.food = meal;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.eat("kotletka");
        gav.show();
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("fish");
        black.show();
    }
}
