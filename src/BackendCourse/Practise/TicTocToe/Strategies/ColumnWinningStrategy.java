package BackendCourse.Practise.TicTocToe.Strategies;

import BackendCourse.Practise.TicTocToe.Models.Cell;
import BackendCourse.Practise.TicTocToe.Models.CellState;
import BackendCourse.Practise.TicTocToe.Models.Game;
import BackendCourse.Practise.TicTocToe.Models.Player;

public class ColumnWinningStrategy implements WinningStrategy {
    @Override
    public boolean isWinningMove(Game game) {
        //TODO: Iterate over all the rows and decide if the game ends
        // O(N)
        Player currentPlayer = game.getPlayerList().get(game.getCurrPlayerIndex());

        Cell cell = game.moves.getLast(); // getting last move
        int row = cell.row;
        int col = cell.col;

        for( int i = 0; i < game.board.getN(); i++ ){
            Cell currentCell = game.board.getCells().get(col).get(i);
            if( currentCell.getCellState().equals( CellState.EMPTY ) || !currentCell.getPlayer().equals( currentPlayer ) )
                return false;
        }
        return true;
    }
}
