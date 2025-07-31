package EvozonJavaBasics.IfElse;

public class LogicalOp {
    // IF-ELSE
    public int checkBiggerNumber(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public String textComparison(String input) {
        if (input.equals("Evozon"))
            return "Learning text comparison";
        else   
            return "Got to try some more";
    }

    public String textComparisonV2(String string, int number) {
        if (string.equals("Evozon") && number <= 3)
            return string + " " + number;
        else if (! string.equals("Evozon") && number >= 4) 
            return number + " " + string;
        else 
            return null;
    }

    public String numberComparison(int number) {
        if (number > 8 || number == 6)
            return "The amount of snow this winter was(cm): " + number;
        else
            return "The forecast snow is(cm): " + number;
    }

    public String numberComparisonV2(int number) {
        if (number > 3 && number != 4)
            return "The number is greater than 3 and not equal to 4";
        else if (number == 4)
            return "The number is equal to 4";
        else 
            return "The number is lower than 3";
    }

     public void switchCase(int digit) {
        switch (digit) {
            case 0:
                System.out.println("The number is 0!");
                break;

            case 1:
                System.out.println("The number is 1!");
                break;

            case 2:
                System.out.println("The number is 2!");
                break;

            case 3:
                System.out.println("The number is 3!");
                break;

            case 4:
                System.out.println("The number is 4!");
                break;

            case 5:
                System.out.println("The number is 5!");
                break;

            case 6:
                System.out.println("The number is 6!");
                break;

            case 7:
                System.out.println("The number is 7!");
                break;

            case 8:
                System.out.println("The number is 8!");
                break;

            case 9:
                System.out.println("The number is 9!");
                break;
        
            default:
                break;
        }
    }

    public boolean isNumberEven(int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }

    public int biggestOutOfThree(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
    }

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

    // WHILE-LOOPS
    public void whileExercise1(int number) {
        int currentNumber = number;
        if (number > 100) {
            while (currentNumber >= 100) {
                System.out.println(currentNumber);
                currentNumber--;
            }
        }
        else {
            while (currentNumber <= 100) {
                System.out.println(currentNumber);
                currentNumber++;
            }
        }
    }

    public void whileExercise2(int number) {
        int currentNumber = number;
        if (number > -100) {
            while (currentNumber >= -100) {
                System.out.println(currentNumber);
                currentNumber--;
            }
        }
        else {
            while (currentNumber <= -100) {
                System.out.println(currentNumber);
                currentNumber++;
            }
        }
    }

    public void whileExercise3(int a, int b) {
        int currentNumber = a;
        if (a > b) {
            while (currentNumber >= b) {
                System.out.println(currentNumber);
                currentNumber--;
            }
        }
        else {
            while (currentNumber <= b) {
                System.out.println(currentNumber);
                currentNumber++;
            }
        }
    }

    public void whileExercise4(int a, int b) {
        if (a > b) {
            int currentNumber = b;
            while (currentNumber <= a) {
                System.out.println(currentNumber);
                currentNumber++;
            }
        }
        else {
            int currentNumber = a;
            while (currentNumber <= b) {
                System.out.println(currentNumber);
                currentNumber++;
            }
        }   
    }

    public void whileExercise5() {
        int currentNumber = 2;
        while (currentNumber <= 100) {
            System.out.println(currentNumber);
            currentNumber += 2;
        }
    }

    public void whileExercise6() {
        int currentNumber = 1;
        while (currentNumber <= 100) {
            System.out.println(currentNumber);
            currentNumber += 2;
        }
    }

    public void whileExercise7() {
        int count = 0;
        long sum = 0;
        int currentNumber = 111;
        while (currentNumber <= 8899) {
            count++;
            sum += currentNumber;
            currentNumber++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / count);
    }

    public void whileExercise8(int a, int b) {
        int count = 0;
        long sum = 0;
        int currentNumber = a;
        while (currentNumber <= b) {
            if (currentNumber % 7 == 0) {
                count++;
                sum += currentNumber;
            }
            currentNumber++;
        }
        System.out.println("Average: " + (double) sum / count);
    }  
    
    public void whileExercise9() {
        int a = 0, b = 1, currentNumber = 0;
        int count = 2;
        System.out.println(a);
        System.out.println(b);
        while (count < 20) {
            currentNumber = a + b;
            System.out.println(currentNumber);
            a = b;
            b = currentNumber;
            count++;
        }
    }

    public void CozaLozaWoza() {
       int currentNumber = 1;
       int lineCount = 0;
       while (currentNumber <= 110) {
            if (lineCount == 11) {
                System.out.println();
                lineCount = 0;
            }
            
            String result = "";
            if (currentNumber % 3 == 0)
                result += "Coza";

            if (currentNumber % 5 == 0)
                result += "Loza";

            if (currentNumber % 7 == 0) {
                if (currentNumber % 3 != 0 && currentNumber % 5 == 0) { //cause it should be WozaLoza, not LozaWoza
                    result = "Woza" + result;
                }   
                else
                    result += "Woza";
            }

            if (result.equals("")) 
                System.out.print(currentNumber + " ");
            else
                System.out.print(result + " ");

            lineCount++;
            currentNumber++;
       }
    }
}