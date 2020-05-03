package aermicioi.pres.lombok.equalsandhashcode;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(exclude = "z")
public class Point {

    private final int x;
    private final int y;
    private final int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
