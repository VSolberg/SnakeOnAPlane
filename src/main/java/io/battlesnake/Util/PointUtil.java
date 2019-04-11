package io.battlesnake.Util;

import java.awt.*;

public class PointUtil {

    public static Point parsePoint(double x, double y) {
        Point parsedPoint = new Point();
        parsedPoint.setLocation(x, y);

        return parsedPoint;
    }

}
