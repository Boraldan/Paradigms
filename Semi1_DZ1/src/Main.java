import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-2, 0, 3, 3, 7, 1, -9, 1, 3));

        for (int el : sortMe(list)) {
            System.out.print(el + " ");
        }

    }

    public static List<Integer> sortMe(List<Integer> inList) {

        for (int i = 0; i < inList.size(); i++) {
            int min = inList.get(i);
            int index = i;
            for (int j = i; j < inList.size() - 1; j++) {
                if (min > inList.get(j + 1)) {
                    min = inList.get(j + 1);
                    index = j + 1;
                }
            }
            inList.add(0, inList.get(index));
            inList.remove(index + 1);
        }
        return inList;
    }

}