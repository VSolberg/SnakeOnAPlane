package io.battlesnake.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameObject {
    @JsonProperty("x")
    private Integer x;

    @JsonProperty("y")
    private Integer y;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
