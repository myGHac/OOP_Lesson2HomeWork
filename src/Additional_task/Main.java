package Additional_task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите радиус: ");
        Scanner sc = new Scanner(System.in);
        double rad  = sc.nextDouble();

        System.out.println("Площадь круга: " + MyArea.areaOfCircle(rad));

    }
}
