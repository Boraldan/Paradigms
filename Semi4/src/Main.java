import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int [] mas = {1,2,3,4,5,6,7,8,9};
        long n = Arrays.stream(mas).filter(x -> x >= 5).count();
        System.out.println(n);

        Map<String, Double> result = new HashMap<>();
        result.put("positive", 0.0);
        result.put("zero", 0.0);
        result.put("negative", 0.0);

        List <Double> L = new ArrayList<>();

        for (double el: result.values()           ) {
            L.add(el);
        }

    }
}