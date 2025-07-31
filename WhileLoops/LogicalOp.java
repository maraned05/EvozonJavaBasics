package EvozonJavaBasics.WhileLoops;

public class LogicalOp {
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