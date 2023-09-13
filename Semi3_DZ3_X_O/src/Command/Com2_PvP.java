package Command;

import Domen.FieldGame;
import UseCase.PvP;
import java.util.Scanner;

public class Com2_PvP implements Option {
    @Override
    public String info() {
        String text = "Режим PvP";
        return text;
    }

    @Override
    public void doit() {
        System.out.print("Введите имя первого игрока: ");
        Scanner scan = new Scanner(System.in);
        String name1 = scan.nextLine();
        Domen.Player player1 = new Domen.Player(name1, 'X');
        System.out.print("Введите имя второго игрока: ");
        String name2 = scan.nextLine();
        Domen.Player player2 = new Domen.Player(name2, 'O');
        FieldGame fieldGame = new FieldGame();
        PvP pvp = new PvP(player1, player2, fieldGame);
        System.out.println(pvp.gamePvP());
    }
}

