package BackendCourse.Practise.TicTocToe.Strategies;

import BackendCourse.Practise.TicTocToe.Models.Game;

public interface WinningStrategy {
    boolean isWinningMove(Game game);

}
