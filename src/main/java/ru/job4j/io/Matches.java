package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " Введите число");
            int matches = Integer.parseInt(input.nextLine());
            while (matches > 3 || matches < 1 || (count < 3 && matches > count)) {
                if (matches > 3 && count > 3) {
                    System.out.println("Введите число от 1 до 3:");
                }
                if (matches < 1) {
                    System.out.println("Введте число больше 0:");
                }
                if ((count < 3 && matches > count)) {
                    System.out.println("Введите число от 1 до " + count + ":");
                }
                matches = Integer.parseInt(input.nextLine());
            }
            turn = !turn;
            count = count - matches;
            System.out.println("Осталось " + count + " шт");
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}