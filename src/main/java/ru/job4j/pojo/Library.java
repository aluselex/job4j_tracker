package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book zero = new Book("Dandelion wine", 318);
        Book first = new Book("Platero y yo", 158);
        Book second = new Book("Clear code", 100);
        Book third = new Book("The lost world", 320);
        Book[] books = new Book[4];
        books[0] = zero;
        books[1] = first;
        books[2] = second;
        books[3] = third;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println("Replace books 0 and 3:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println("Clear code book:");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clear code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPages());
            }

        }
    }
}
