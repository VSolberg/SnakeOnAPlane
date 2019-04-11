package io.battlesnake.Util;

import io.battlesnake.models.GameObject;

import java.awt.*;
import java.util.List;

public class PositionUtil {

    public static String calculateMoveDirection(Point target, Point origin) {
        double xCords = target.getX() - origin.getX();
        double yCords = target.getY() - origin.getY();

        if(xCords < 0)
            return "left";
        else if(xCords > 0)
            return "right";
        else if(yCords > 0)
            return "down";
        else
            return "up";
    }

}
