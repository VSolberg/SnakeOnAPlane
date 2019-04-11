package io.battlesnake.models;

import lombok.Data;

import java.util.List;

@Data
public class GameBoard {
    private Integer width;
    private Integer height;
    private List<GameEntity> snakes;
    private List<GameObject> food;
}
