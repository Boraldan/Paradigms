import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        int dec = 12;
        ArrayList<Integer> two = new ArrayList<>();
        while (dec != 0) {
            two.add(0, dec % 2);
            dec = dec / 2;
        }
        System.out.println(two);
    }
}
