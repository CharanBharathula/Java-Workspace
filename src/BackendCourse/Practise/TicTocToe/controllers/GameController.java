package BackendCourse.Practise.TicTocToe.controllers;

import BackendCourse.Practise.TicTocToe.Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {
    Game game;

    public GameController(Game game) {
        this.game = game;
    }

    public static Game initializeGame() {
        System.out.println( "Enter the board size" );
        Scanner scanner = new Scanner( System.in );
        int boardSize = scanner.nextInt();
        List<Player> players = new ArrayList<>();
        for ( int i = 0; i < 2; i++ ){
            System.out.println("Enter Player name and symbol");
            String name = scanner.next();
            Character symbol = scanner.next().charAt(0);

            //TODO: handle bot players as input
            players.add( new HumanPlayer(name, symbol, i+1) ); // 1 based index
        }

        return new Game(boardSize, players);
    }

    /*
    * Helps user to find next move
    * 1. finds next move od the user
    * 2. calls makeMove() on the current player
    * 3. update the board with the move and corresponding player symbol
    * check all winning possibilities
    *
    * */

    public void makeNextMove() {
        if( game.getBoard().isFull() ){
            game.setDraw();
            return;
        }
        //Step1: find the current player
        int currentPlayerIndex = game.getCurrPlayerIndex();
        Player currentPlayer = game.getPlayerList().get(currentPlayerIndex);

        // Step2: make move
        System.out.printf("It's %s player's move\n", currentPlayer.getName());

        //Step 3: update the board
        game.makeMoveForCurrPlayer();

        //Step 4: check for winning possibilities
        game.postMoveWinnerCheck();
    }
}