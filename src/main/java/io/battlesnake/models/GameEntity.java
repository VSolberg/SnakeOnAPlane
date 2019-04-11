package io.battlesnake.models;

import lombok.Data;

@Data
public class GameEntity {
    private String id;
    private String name;
    private Integer health;
    private EntityBody body;
}
