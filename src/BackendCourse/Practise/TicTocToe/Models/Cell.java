package BackendCourse.Practise.TicTocToe.Models;

import lombok.Getter;

@Getter
public class Cell {
    public int row;
    public int col;

    Player player;

    CellState cellState;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
    }

    public void updateCell(Player player) {
        this.player = player;
        this.cellState = CellState.OCCUPIED;


    }
}
