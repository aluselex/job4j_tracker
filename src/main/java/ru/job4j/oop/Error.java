package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Error active: " + active);
        System.out.println("Error status: " + status);
        System.out.println("Error message: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error snow = new Error(false, 0, "it's not snowing");
        snow.printInfo();
        Error rain = new Error(true, 1, "it's raining");
        rain.printInfo();
        Error cold = new Error(true, 2, "I caught a cold");
        cold.printInfo();
    }
}
