package BackendCourse.Practise.TicTocToe.Strategies;

import BackendCourse.Practise.TicTocToe.Models.Board;
import BackendCourse.Practise.TicTocToe.Models.CellState;
import BackendCourse.Practise.TicTocToe.Models.Player;

public interface BotPlayingStrategy {
    CellState suggestedMove(Player player, Board board);
}
