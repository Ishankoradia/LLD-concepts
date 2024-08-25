package lld.MachineCoding.TicTacToe.models;

import lld.MachineCoding.TicTacToe.enums.CellState;

public class Cell {
    private int row;
    private int col;
    private Player player; // which player has marked the cell
    private CellState cellState;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
        this.player = null;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public void display() {
        if (player == null) {
            System.out.print("| - |");
        } else {
            System.out.print("| " + player.getSymbol().getSymbol() + " |");
        }
    }

}