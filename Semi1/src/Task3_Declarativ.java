import java.util.*;

public class Task3_Declarativ {
    public static void main(String[] args) {

        // поиск доль в массиве позитивных, негативных и нулю  (EM)
        // декларативный способ

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, -4, 1, 2, 7, 0, -1));

    }

    public static Map<String, Double> findShares(List<Integer> list) {
        Map<String, Double> result = new HashMap<>();
        result.put("positive", 0.0);
        result.put("zero", 0.0);
        result.put("negative", 0.0);

        if (list.isEmpty()) return result;

        result.put("positive", ((double) list.stream().filter(x -> x > 0).count()) / list.size());
        result.put("zero", ((double) list.stream().filter(x -> x == 0).count()) / list.size());
        result.put("negative", ((double) list.stream().filter(x -> x < 0).count()) / list.size());
        return result;
    }


}
