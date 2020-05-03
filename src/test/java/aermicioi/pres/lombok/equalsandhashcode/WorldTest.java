package aermicioi.pres.lombok.equalsandhashcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class WorldTest {

    @Test
    public void testWorld() {
        final Set<Point2D> points = new HashSet<>();
        points.add(new Point3D(1, 2, 1));
        points.add(new Point3D(1, 3, 1));

        assertEquals(2, points.size()); // < Updated
    }

}