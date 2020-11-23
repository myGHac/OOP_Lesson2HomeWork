package task4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;


    public Car(double speed) {
        this(2020, 180, 1800);

    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = 180;
        this.weight = 2000;
    }

    public Car(int year, int weight) {
        this(year, 120, 2000);

    }
}
