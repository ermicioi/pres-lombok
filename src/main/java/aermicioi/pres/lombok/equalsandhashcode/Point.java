package aermicioi.pres.lombok.equalsandhashcode;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(doNotUseGetters = true)
public class Point {

    private final int x;
    private final int y;
    private final int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getZ() {
        return 0;
    }
}
