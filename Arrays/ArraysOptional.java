package EvozonJavaBasics.Arrays;

public class ArraysOptional {
    // Exercise 1 was already done previously

    public int[] exercise2(int[] array, int pos, int element) {
        int[] newArray = new int[array.length+1];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (index == pos) {
                newArray[index++] = element;
            }
            newArray[index] = array[i];
            index++;
        }
        return newArray;
    }

    public void exercise3(int[] array) {
        int max = array[0], min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Max: " + max + ", min: " + min);
    }
}
