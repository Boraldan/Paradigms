package Command;

import Domen.FieldGame;
import Domen.Ii;
import UseCase.LogicIi;
import UseCase.PvIi;
import java.util.Scanner;

public class Com3_PvIi implements Option {
    @Override
    public String info() {
        String text = "Режим PvIi";
        return text;
    }

    @Override
    public void doit() {
        System.out.print("Введите имя первого игрока: ");
        Scanner scan = new Scanner(System.in);
        String name1 = scan.nextLine();
        Domen.Player player1 = new Domen.Player(name1, 'X');
        Ii ii = new Ii(new LogicIi());
        FieldGame fieldGame = new FieldGame();
        PvIi pvIi = new PvIi(player1, ii, fieldGame);
        System.out.println(pvIi.gamePvIi());

    }
}
