package io.battlesnake.Util;

import com.google.common.collect.Lists;

import java.awt.*;
import java.util.List;

public class PointUtil {

    public static Point parsePoint(double x, double y) {
        Point parsedPoint = new Point();
        parsedPoint.setLocation(x, y);

        return parsedPoint;
    }

    public static List<Point> reversePath(List<Point> map) {
        return Lists.reverse(map);
    }

    public static Point flip(Point point) {
        point.setLocation(point.getY(), point.getX());
        return point;
    }
}
