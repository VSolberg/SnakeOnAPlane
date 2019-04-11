package io.battlesnake.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GameState {
    @JsonProperty("game")
    private GameId gameId;

    @JsonProperty("turn")
    private Integer turn;

    @JsonProperty("board")
    private GameBoard board;

    @JsonProperty("you")
    private GameEntity localPlayer;
}
