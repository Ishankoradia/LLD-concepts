package lld.MachineCoding.TicTacToe.models;

import lld.MachineCoding.TicTacToe.enums.PlayerType;

public class Player {
    private int id;
    private String name;
    private Symbol symbol;
    private PlayerType playerType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

}
