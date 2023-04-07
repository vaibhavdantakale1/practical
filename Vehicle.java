package ProbleS1;

public class Vehicle {
	String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("Driving the " + year + " " + brand + " " + model);
    }
}

class Car extends Vehicle {
    String color;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    public void honk() {
        System.out.println("The " + color + " car is honking!");
    }
}

   public class Main {
     public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2022, "red");
        myCar.drive();
        myCar.honk();
    }
}


