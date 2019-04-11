package io.battlesnake.action;

import io.battlesnake.Util.GameStateUtil;
import io.battlesnake.Util.PositionUtil;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameMove {

    private List<Point> path;

    public GameMove(List<Point> path) {
        this.path = path;
    }

    public Map<String, String> getNextAction(Point playerPoint, Point targetPoint) {
        Map<String, String> response = new HashMap<>();

        String move = PositionUtil.calculateMoveDirection(targetPoint, playerPoint);
        response.put("move", move);

        return response;
    }
}
