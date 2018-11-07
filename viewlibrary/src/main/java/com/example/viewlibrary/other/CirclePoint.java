package com.example.viewlibrary.other;

import android.graphics.Point;

/**
 * 作者：Tyhj on 2018/11/7 18:54
 * 邮箱：tyhj5@qq.com
 * github：github.com/tyhjh
 * description：
 */

public class CirclePoint {
    public int x, y, x2, y2;
    public int angle;
    public double circleR, circleX, circleY;

    public CirclePoint(int angle, double circleR, double circleX, double circleY) {
        this.angle = angle;
        this.circleR = circleR;
        this.circleX = circleX;
        this.circleY = circleY;
        Point point = getPoint(angle);
        x = point.x;
        y = point.y;
        x2 = x;
        y2 = y;
    }


    public void move() {

    }

    public Point getBezierPoint() {
        return getPoint(angle + 1);
    }


    public Point getPoint(int angle) {
        double x = 0, y = 0;
        if (angle == -180) {
            x = -circleR;
            y = 0;
        } else if (angle == -90) {
            x = 0;
            y = -circleR;
        } else if (angle == 0) {
            x = circleR;
            y = 0;
        } else if (angle == 90) {
            x = 0;
            y = circleR;
        } else {
            y = (Math.sin(Math.toRadians(angle)) * circleR);
            x = (Math.cos(Math.toRadians(angle)) * circleR);
        }
        return new Point((int) (x + circleX), (int) (y + circleY));
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
