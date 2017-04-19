package SCJP;

/**
 * Created by deepali on 13-05-2016.
 */
class Vehicle {
    public void printSound() {
        System.out.print("vehicle");
    }
}

class Car extends Vehicle {
    public void printSound() {
        System.out.print("car");
    }
}

class Bike extends Vehicle {
    public void printSound() {
        System.out.print("bike");
    }
}

public class Test {
    public static void main(String[] args) {
        Vehicle v = new Car();
        Bike b = (Bike) v;

        v.printSound();
        b.printSound();
    }
}