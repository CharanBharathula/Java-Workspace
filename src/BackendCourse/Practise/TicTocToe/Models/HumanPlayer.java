package BackendCourse.Practise.TicTocToe.Models;

import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name, Character symbol, int id) {
        super(name, symbol, id);
    }

    @Override
    public Cell makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your next move?");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        return new Cell(row, col);
    }
}
