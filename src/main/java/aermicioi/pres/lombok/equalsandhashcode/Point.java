package aermicioi.pres.lombok.equalsandhashcode;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
