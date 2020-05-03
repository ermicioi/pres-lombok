package aermicioi.pres.lombok.equalsandhashcode;

import java.util.Objects;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !obj.getClass().equals(this.getClass())) {
            return false;
        }

        final Point that = (Point) obj;
        return Objects.equals(this.x, that.x) && Objects.equals(this.y, that.y);
    }
}
