package ru.vsu.cs.volobueva;

public class Picture {
    final Circle circle;
    final HorizontalParabola parabola1;
    final HorizontalParabola parabola2;
    final HorizontalParabola parabola3;

    public Picture(Circle circle, HorizontalParabola parabola1, HorizontalParabola parabola2, HorizontalParabola parabola3) {
        this.circle = circle;
        this.parabola1 = parabola1;
        this.parabola2 = parabola2;
        this.parabola3 = parabola3;
    }

    public SimpleColor getColor(double x, double y) {
        if (parabola1.isPointRightOfParabola(x, y) && parabola2.isPointRightOfParabola(x, y)
                && !parabola3.isPointRightOfParabola(x, y)) {
            return checkingOutsideParabolas123(x, y);
        } else return checkingInsideParabola1(x, y);
    }

    SimpleColor checkingInsideParabola1(double x, double y) {
        if (!parabola1.isPointRightOfParabola(x, y)) {
            if (circle.isPointInCircle(x, y)) {
                return SimpleColor.WHITE;
            } else if (!parabola2.isPointRightOfParabola(x, y)) {
                return SimpleColor.YELLOW;
            } else return SimpleColor.BLUE;
        } else return checkingInsideParabola3(x, y);
    }

    SimpleColor checkingInsideParabola3(double x, double y) {
        if (parabola3.isPointRightOfParabola(x, y)) {
            if (!parabola2.isPointRightOfParabola(x, y)) {
                return SimpleColor.YELLOW;
            } else if (circle.isPointInCircle(x, y)) {
                return SimpleColor.GRAY;
            } else return SimpleColor.GREEN;
        } else return checkingInsideParabola2(x, y);
    }

    SimpleColor checkingInsideParabola2(double x, double y) {
        if (!parabola2.isPointRightOfParabola(x, y)) {
            if (circle.isPointInCircle(x, y)) {
                if (!parabola3.isPointRightOfParabola(x, y)) {
                    return SimpleColor.GRAY;
                } else return SimpleColor.YELLOW;
            } else if (!parabola1.isPointRightOfParabola(x, y)) {
                return SimpleColor.YELLOW;
            } else return SimpleColor.BLUE;
        } else return checkingOutsideParabolas123(x, y);
    }

    SimpleColor checkingOutsideParabolas123(double x, double y) {
        if (circle.isPointInCircle(x, y)) {
            return SimpleColor.GRAY;
        } else if (y > -4) {
            return SimpleColor.ORANGE;
        } else if (y < -4) {
            return SimpleColor.YELLOW;
        }
        return SimpleColor.WHITE;
    }
}