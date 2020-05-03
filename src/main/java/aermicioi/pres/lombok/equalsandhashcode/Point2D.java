package aermicioi.pres.lombok.equalsandhashcode;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Point2D {

    private final int x;
    private final int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
