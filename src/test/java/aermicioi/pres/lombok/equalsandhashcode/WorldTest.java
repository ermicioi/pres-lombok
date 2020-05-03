package aermicioi.pres.lombok.equalsandhashcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class WorldTest {

    @Test
    public void testWorld() {
        final Set<Point> points = new HashSet<>();
        points.add(new Point(1, 2));
        points.add(new Point(1, 2));

        assertEquals(1, points.size());
    }

}