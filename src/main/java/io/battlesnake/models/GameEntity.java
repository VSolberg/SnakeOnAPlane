package io.battlesnake.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GameEntity {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("health")
    private Integer health;

    @JsonProperty("body")
    private List<GameObject> body;
}
