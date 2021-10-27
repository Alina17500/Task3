package ru.vsu.cs.volobueva;

public class Picture {
    public final Circle C = new Circle(-3, -3, 4);
    public final HorizontalParabola P1 = new HorizontalParabola(2, 3, -1);
    public final HorizontalParabola P2 = new HorizontalParabola(-3, -3, -0.25);
    public final HorizontalParabola P3 = new HorizontalParabola(-6, -6, 1);

    public SimpleColor getColor(double x, double y) {
        if (P1.isPointRightOfParabola(x, y) && P2.isPointRightOfParabola(x, y) && !P3.isPointRightOfParabola(x, y)) {
            return checkingOutsideParabolas123(x, y);
        } else return checkingInsideParabola1(x, y);
    }

    SimpleColor checkingInsideParabola1(double x, double y) {
        if (!P1.isPointRightOfParabola(x, y)) {
            if (C.isPointInCircle(x, y)) {
                return SimpleColor.WHITE;
            } else if (!P2.isPointRightOfParabola(x, y)) {
                return SimpleColor.YELLOW;
            } else return SimpleColor.BLUE;
        } else return checkingInsideParabola3(x, y);
    }

    SimpleColor checkingInsideParabola3(double x, double y) {
        if (P3.isPointRightOfParabola(x, y)) {
            if (!P2.isPointRightOfParabola(x, y)) {
                return SimpleColor.YELLOW;
            } else if (C.isPointInCircle(x, y)) {
                return SimpleColor.GRAY;
            } else return SimpleColor.GREEN;
        } else return checkingInsideParabola2(x, y);
    }

    SimpleColor checkingInsideParabola2(double x, double y) {
        if (!P2.isPointRightOfParabola(x, y)) {
            if (C.isPointInCircle(x, y)) {
                if (!P3.isPointRightOfParabola(x, y)) {
                    return SimpleColor.GRAY;
                } else return SimpleColor.YELLOW;
            } else if (!P1.isPointRightOfParabola(x, y)) {
                return SimpleColor.YELLOW;
            } else return SimpleColor.BLUE;
        } else return checkingOutsideParabolas123(x, y);
    }

    SimpleColor checkingOutsideParabolas123(double x, double y) {
        if (C.isPointInCircle(x, y)) {
            return SimpleColor.GRAY;
        } else if (y > -4) {
            return SimpleColor.ORANGE;
        } else if (y < -4) {
            return SimpleColor.YELLOW;
        }
        return SimpleColor.WHITE;
    }
}