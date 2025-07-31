package EvozonJavaBasics.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // LogicalOp operations = new LogicalOp();
        // operations.arraysExercise2();

        // int[] array = new int[50];
        // int[] newArray = operations.arraysExercise3(array);
        // for (int i = 0; i < 50; i++) {
        //     System.out.println(newArray[i]);
        // }

        // int[] array1 = {2, 3, 7, 8, 2};
        // System.out.println(operations.arraysExercise4(array1));

        // String[] array2 = {"salut", "buna", "ce faci"};
        // System.out.println(operations.arraysExercise5(array2, "ce"));

        // System.out.println(operations.arraysExercise6(array1, 9));

        // operations.arraysExercise7();

        // int[] array3 = {2, 3, 7, 2, 8, 4, 2};
        // int[] newArray1 = operations.arraysExercise8(array3, 2);
        // for (int i = 0; i < newArray1.length; i++) {
        //     System.out.print(newArray1[i] + " ");
        // }
        // System.out.println();

        // System.out.println(operations.arraysExercise9(array1));

        // int[] someArray = {2, 6, 3};
        // int[] emptyArray = new int[3];
        // operations.arraysExercise11(someArray, emptyArray);
        // for (int i = 0; i < emptyArray.length; i++) {
        //     System.out.print(emptyArray[i] + " ");
        // }

        Lists listOperations = new Lists();
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        // listOperations.listsExercise1(list);
        // listOperations.listsExercise2(list, 0);
        // System.out.println(list.getLast());
        //listOperations.listsExercise3(list, 2);
        //listOperations.listsExercise4(list);

        List<String> list1 = new ArrayList<>();
        list1.add("helo");
        list1.add("buna");
        listOperations.listsExercise5(list1, "ce", 0);
        for (String a: list1) {
            System.out.println(a);
        }

        listOperations.listsExercise7(list);
        System.out.println(listOperations.listsExercise8(list));
    }
}
