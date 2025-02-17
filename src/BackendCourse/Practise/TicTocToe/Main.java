package BackendCourse.Practise.TicTocToe;

import BackendCourse.Practise.TicTocToe.Models.Board;
import BackendCourse.Practise.TicTocToe.Models.Game;
import BackendCourse.Practise.TicTocToe.Models.GameState;
import BackendCourse.Practise.TicTocToe.controllers.GameController;

public class Main {
    public static void main(String[] args) {
        Game game = GameController.initializeGame();

        GameController gameController = new GameController(game);

        while( game.getGameState().equals(GameState.IN_PROGRESS) ){
            game.getBoard().displayBoard();
            // prints next player's move
            // ask user for input
            gameController.makeNextMove();
        }
        game.getBoard().displayBoard();
        if( game.getGameState().equals(GameState.WINNING) ){
            System.out.printf("Player %s won", game.getWinner().getName());
        } else {
            System.out.println("It's a draw");
        }
    }
}
