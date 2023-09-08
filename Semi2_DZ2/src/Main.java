import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printTable();
    }

    public static void printTable() {
        System.out.print("Введите число: ");
        int num = new Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}