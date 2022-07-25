package ru.job4j.oop;

public class Transport {

    public static void main(String[] args) {
        Vehicle ultralight = new Airplane("An-2");
        Vehicle jet = new Airplane("A-380");
        Vehicle localTrain = new Train("Local train");
        Vehicle supsan = new Train("Supsan");
        Vehicle shuttleBus = new Bus("Shuttle bus");
        Vehicle touristBus = new Bus("Tourist bus");

        Vehicle[] vehicles = new Vehicle[]{ultralight, jet, localTrain, supsan, shuttleBus, touristBus};
        for (Vehicle vehicle : vehicles) {
            System.out.print(vehicle.toString() + " - ");
            vehicle.move();
        }
    }
}
