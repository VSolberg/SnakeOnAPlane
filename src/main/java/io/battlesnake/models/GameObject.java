package io.battlesnake.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GameObject {
    @JsonProperty("x")
    private Integer x;

    @JsonProperty("y")
    private Integer y;
}
