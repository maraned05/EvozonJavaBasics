package EvozonJavaBasics.Assignment2;

public class Exercises {
    public static void main(String[] args) {
        exercise3();
        System.out.println(exercise4(3, 3, 5));
        System.out.println(exercise5(7, 5));
        System.out.println(exercise6(79));
        System.out.println(exercise7(200));
        exercise8(12823, 1, 54, 23);
        exercise9(9);
    }

    // Ex. 3
    public static void exercise3() {
        System.out.println(" +\"\"\"\"\"+                                                 \n" + //
                        "[| o o |]                                                \n" + //
                        " |  ^  |                                                 \n" + //
                        " | '-' |                                                 \n" + //
                        " +-----+");
    }

    // Ex. 4
    public static float exercise4(int a, int b, int c) {
        return (float) (a + b + c) / 3;
    }

    // Ex. 5
    public static int exercise5(int a, int b) {
        return a % b;
    }

    // Ex. 6
    public static float exercise6(int fahrenheit) {
        return (float) 5 / 9 * (fahrenheit -  32);
    }

    // Ex. 7
    public static float exercise7(float inches) {
        return inches / (float) 39.37;
    }

    // Ex. 8
    public static void exercise8(int meters, int hours, int minutes, int seconds) {
        float metersPerSec = (float) meters / (seconds + minutes * 60 + hours * 3600);
        System.out.println("Meters / s: " + metersPerSec);

        float kmsPerHour = ((float) meters / 1000) / (hours + (float) minutes / 60 + (float) seconds / 3600);
        System.out.println("Kilometers / h: " + kmsPerHour);

        float milesPerHour = ((float) meters / 1609) / (hours + (float) minutes / 60 + (float) seconds / 3600);
        System.out.println("Miles / h: " + milesPerHour);
    }

    // Ex. 9
    public static void exercise9(float radius) {
        float area =(float) 3.14 * radius * radius;
        float perimeter = (float) 3.14 * 2 * radius;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
