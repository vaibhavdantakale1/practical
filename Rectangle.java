package Abstraction;

public abstract class Rectangle {
	 
		    public abstract double areaOfRectangle(double length, double width);
		    public abstract double perimeterOfRectangle(double length, double width);
		}
    class MyRectangle extends Rectangle {
    @Override
    public double areaOfRectangle(double length, double width) {
        return length * width;
    }

    @Override
    public double perimeterOfRectangle(double length, double width) {
        return 2 * (length + width);
    }
}
  class Main {
    public static void main(String[] args) {
        MyRectangle myRectangle = new MyRectangle();
        double area = myRectangle.areaOfRectangle(8, 10);
        double perimeter = myRectangle.perimeterOfRectangle(7, 10);
        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}

