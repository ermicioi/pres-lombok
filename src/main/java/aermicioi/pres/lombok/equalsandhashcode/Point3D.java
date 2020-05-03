package aermicioi.pres.lombok.equalsandhashcode;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class Point3D extends Point2D {

    private final int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
