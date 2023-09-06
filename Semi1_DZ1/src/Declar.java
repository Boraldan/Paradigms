import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Declar {
    public static void main(String[] args) {

       Arrays.asList(-2, 0, 3, 3, 7, 1, -9, 1, 3)
               .stream().sorted(Collections.reverseOrder())
               .forEach(System.out::println);

    }
}
