package EvozonJavaBasics.ForLoops;

public class LogicalOp {
    // FOR-LOOPS
    public void numberingTo100(int number) {
        if (number > 100) {
            for (int i = number; i >= 100; i--) {
                System.out.println(i);
            }
        }
        else {
            for (int i = number; i <= 100; i++) {
                System.out.println(i);
            }
        }
    }

    public void numberingToNegative100(int number) {
        if (number > -100) {
            for (int i = number; i >= -100; i--) {
                System.out.println(i);
            }
        }
        else {
            for (int i = number; i <= -100; i++) {
                System.out.println(i);
            }
        }
    }

    public void numberingFromAToB(int a, int b) {
        if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
        else {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }

    public void ascendingNumbering(int a, int b) {
        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }
        else {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }

    public void evenNumbers() {
        for (int i = 2; i <= 100; i += 2)
            System.out.println(i);
    }

    public void oddNumbers() {
        for (int i = 1; i <= 100; i += 2)
            System.out.println(i);
    }

    public long addToHundred(int number) {
        long result = 0;
        if (number <= 100) {
            for (int i = number; i <= 100; i++) 
                result += i;
        }
        else {
            for (int i = number; i >= 100; i--) 
                result += i;
        }

        return result;
    }

    public double averageToHundred(int number) {
        int count = Math.abs(100 - number) + 1;
        long sum = 0;

        if (number <= 100) {
            for (int i = number; i <= 100; i++) 
                sum += i;
        }
        else {
            for (int i = number; i >= 100; i--) 
                sum += i;
        }

        return (double) sum / count;
    }

    public void asterisks() {
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}