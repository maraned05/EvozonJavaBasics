package EvozonJavaBasics.Assignment2;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Sum: " + addTwoIntegers(2,3));
        System.out.println("Difference: " + subtractTwoIntegers(2,3));
        System.out.println("Multiplication: " + multiplyTwoIntegers(2,3));
        System.out.println("Division: " + divideTwoIntegers(2,3));
    }

    public static int addTwoIntegers(int a, int b) {
        return a + b;
    }

    public static int subtractTwoIntegers(int a, int b) {
        return a - b;
    }  

    public static int multiplyTwoIntegers(int a, int b) {
        return a * b;
    } 

    public static float divideTwoIntegers(int a, int b) {
        return (float) a / b;
    } 
}
