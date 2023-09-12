import java.util.Scanner;

public class PvP {
    public String gamePvP() {
        System.out.print("Введите имя первого игрока: ");
        Scanner scan = new Scanner(System.in);
        String name1 = scan.nextLine();
        Player player1 = new Player(name1, 'X');
        System.out.print("Введите имя второго игрока: ");
        String name2 = scan.nextLine();
        Player player2 = new Player(name2, 'O');

        FieldGame game = new FieldGame();

        game.printField(game.fieldStart);
        int count = 0;

        while (count < 9) {
            if (count % 2 == 0) {
                int move = game.move(player1.name + " : X ");
                if (move == -1) return "Победа игрока " + player2.name;
                game.fieldGame[move] = player1.fishka;
                game.printField(game.fieldGame); // работает
                if (game.checkWin()) return "Победа игрока " + player1.name;
                System.out.println("шаг 2");
            } else {
                int move = game.move(player2.name + " : O ");
                if (move == -1) return "Победа игрока " + player1.name;
                game.fieldGame[move] = player2.fishka;
                game.printField(game.fieldGame);
                if (game.checkWin()) return "Победа игрока " + player2.name;
            }
            count++;
        }
        return "----- НИЧЬЯ! -----";
    }
}
