package io.battlesnake.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameState {
    @JsonProperty("game")
    private GameId gameId;

    @JsonProperty("turn")
    private Integer turn;

    @JsonProperty("board")
    private GameBoard board;

    @JsonProperty("you")
    private GameEntity localPlayer;

    public GameId getGameId() {
        return gameId;
    }

    public void setGameId(GameId gameId) {
        this.gameId = gameId;
    }

    public Integer getTurn() {
        return turn;
    }

    public void setTurn(Integer turn) {
        this.turn = turn;
    }

    public GameBoard getBoard() {
        return board;
    }

    public void setBoard(GameBoard board) {
        this.board = board;
    }

    public GameEntity getLocalPlayer() {
        return localPlayer;
    }

    public void setLocalPlayer(GameEntity localPlayer) {
        this.localPlayer = localPlayer;
    }
}
