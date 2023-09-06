import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 1. Найти количество повторений в массиве (Евгений Малютин)
        int[] arr2 = {3, 5, 7, 8, 9};
        System.out.println(find(arr2, 3));

        // Задание 2.
        int[] arr = new int[]{1, 2, 3, -4, 1, 2, 7, 0, -1};
        Task2_Imperativ task2 = new Task2_Imperativ();

        for (var el : task2.find2(arr)) {
            System.out.println(el);
        }

    }


    // Задание 1. Найти количество повторений в массиве (Евгений Малютин)
    public static boolean find(int[] array, int target) {
        return Arrays.stream(array).filter(x -> x == target).count() > 0;
    }


}