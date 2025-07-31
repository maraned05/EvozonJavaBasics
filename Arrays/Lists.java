package EvozonJavaBasics.Arrays;
import java.util.List;

public class Lists {
    public void listsExercise1(List<Integer> list) {
        for (int a : list) {
            System.out.println(a);
        }
    }

    public void listsExercise2(List<Integer> list, int number) {
        list.addLast(number);
    }

    public void listsExercise3(List<Integer> list, int number) {
        for (int i = number; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void listsExercise4(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public void listsExercise5(List<String> list, String string, int number) {
        list.add(number, string);
    }

    public void listsExercise6(List<Integer> list, int number) {
        list.add(0, number);
    }

    public void listsExercise7(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }
    }

    public int listsExercise8(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }

        return max;
    }
}
