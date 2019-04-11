package io.battlesnake.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GameBoard {
    @JsonProperty("width")
    private Integer width;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("snakes")
    private List<GameEntity> snakes;

    @JsonProperty("food")
    private List<GameObject> food;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public List<GameEntity> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<GameEntity> snakes) {
        this.snakes = snakes;
    }

    public List<GameObject> getFood() {
        return food;
    }

    public void setFood(List<GameObject> food) {
        this.food = food;
    }
}
