package Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private List<Option> menuList;

    Scanner scan = new Scanner(System.in);

    public View() {
        this.menuList = new ArrayList<>();
        menuList.add(new Com2_PvP());
        menuList.add(new Com3_PvIi());
        menuList.add(new ComExit());
    }

    public void printMenu() {
        System.out.println("Игра Крестики-Нолики");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(i + 1 + " - " + menuList.get(i).info());
        }
        System.out.println("Введите номер запроса: ");
        int num = scan.nextInt();
        menuList.get(num - 1).doit();
    }
}
