package BackendCourse.Practise.TicTocToe.Strategies;

import BackendCourse.Practise.TicTocToe.Models.Cell;
import BackendCourse.Practise.TicTocToe.Models.CellState;
import BackendCourse.Practise.TicTocToe.Models.Game;
import BackendCourse.Practise.TicTocToe.Models.Player;

public class DiagonalWinningStrategy implements WinningStrategy {
    @Override
    public boolean isWinningMove(Game game) {
        return leftTopToRightBottomDiagonal(game) || rightTopToLeftBottomDiagonal(game);
    }

    public boolean leftTopToRightBottomDiagonal(Game game) {
        Player currentPlayer = game.getPlayerList().get(game.getCurrPlayerIndex());

        for( int i = 0; i < game.board.N; i++ ){
            Cell currentCell = game.board.getCells().get(i).get(game.board.N - i - 1);
            if( currentCell.getCellState().equals( CellState.EMPTY ) || !currentCell.getPlayer().equals( currentPlayer ) )
                return false;

        }
        return true;
    }

    public boolean rightTopToLeftBottomDiagonal(Game game) {
        Player currentPlayer = game.getPlayerList().get(game.getCurrPlayerIndex());

        for( int i = 0; i < game.board.N; i++ ){
            Cell currentCell = game.board.getCells().get(i).get(i);
            if( currentCell.getCellState().equals( CellState.EMPTY ) || !currentCell.getPlayer().equals( currentPlayer ) )
                return false;

        }
        return true;
    }

}
