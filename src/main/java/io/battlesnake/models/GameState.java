package io.battlesnake.models;

import lombok.Data;

import java.util.List;

@Data
public class GameState {
    private Integer turn;
    private GameBoard board;
    private GameEntity localPlayer;
}
