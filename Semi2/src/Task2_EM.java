import java.util.Scanner;

public class Task2_EM {
    public static void main(String[] args) {
        int num = getNum();
        toBinary(num);
        toBinary2(num);
    }

    public static int getNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }

    public static void toBinary(int num) {
        System.out.println(Integer.toBinaryString(num));
    }

    public static void toBinary2(int num) {
        int a;
        StringBuilder builder = new StringBuilder();
        while (num != 0) {
            a = num % 2;
            builder.append(a);
            num = num / 2;
        }
        builder.reverse();
        System.out.println(builder);
    }
}
