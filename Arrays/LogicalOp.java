package EvozonJavaBasics.Arrays;

public class LogicalOp {
    public void arraysExercise2() {
        int[] array = new int[100];
        int index = 0;
        while (index < 100) {
            array[index] = index + 1;
            System.out.println("Array[" + index + "]: " + (index + 1));
            index++;
        }
    }

    public int[] arraysExercise3(int[] array) {
        int index = 0;
        int currentNumber = 2;
        while (currentNumber <= 100) {
            array[index++] = currentNumber;
            currentNumber += 2;
        }

        return array;
    }

    public double arraysExercise4(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        } 

        return (double) sum / array.length;
    }

    public boolean arraysExercise5(String[] array, String string) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(string))
                return true;
        }
        return false;
    }

    public int arraysExercise6(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                return i;
        }
        return -1;
    }

    public void arraysExercise7() {
        char[] array = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'};

        int count = 0;
        while (count < 10) {
            for (int i = 0; i < array.length; i++) 
                System.out.print(array[i] + " ");
            System.out.println();
            count++;
        }
    }


    public int[] arraysExercise8(int[] array, int number) {
        int actualLength = array.length;

        for (int i = 0; i < actualLength; i++) {
            if (array[i] == number) {
                int index = i;
                while (index < actualLength - 1) {
                    array[index] = array[index + 1];
                    index++;
                }
                actualLength--;
                i--; // to not skip the element that came in the place of the one removed
            }   
        }
        if (array[actualLength - 1] == number)
            actualLength--;
        
        int[] newArray = new int[actualLength];
        for (int i = 0; i < actualLength; i++)
            newArray[i] = array[i];

        return newArray;
    }

    public int arraysExercise9(int[] array) {
        int min = 0, secondMin = 0;
        boolean foundMin = false, foundSecondMin = false;

        for (int i = 0; i < array.length; i++) {
            if (! foundMin) {
                min = array[i];
                foundMin = true;
            }
            else if (foundMin && !foundSecondMin) {
                secondMin = array[i];
                foundSecondMin = true;
            }
            else {
                if (array[i] < min) {
                    secondMin = min;
                    min = array[i];
                }
                else if (array[i] < secondMin && array[i] > min)
                    secondMin = array[i];
            }
        }

        return secondMin;
    }

    public void arraysExercise11(int[] array, int[] emptyArray) {
        for (int i = 0; i < array.length; i++) {
            emptyArray[i] = array[i];
        }
    }

}