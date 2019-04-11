package io.battlesnake.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GameEntity {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("health")
    private Integer health;

    @JsonProperty("body")
    private List<GameObject> body;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public List<GameObject> getBody() {
        return body;
    }

    public void setBody(List<GameObject> body) {
        this.body = body;
    }
}
