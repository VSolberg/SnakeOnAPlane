package io.battlesnake.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GameBoard {
    @JsonProperty("width")
    private Integer width;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("snakes")
    private List<GameEntity> snakes;

    @JsonProperty("food")
    private List<GameObject> food;
}
