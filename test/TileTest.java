import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class TileTest {
    @Test
    public void testToGenerateGridOfSizeThreeCrossThree() throws Exception {
        Tile t = new Tile("00");
        assertFalse(t.isOccupied());
    }

    @Test
    public void testShouldGiveIdOfATile() throws Exception {
        Tile t = new Tile("00");
        assertEquals("00",t.getId());
    }

    @Test
    public void testShouldGiveTrueWhenTheTileIsOccupied() throws Exception {
        Tile t = new Tile("00");
        assertFalse(t.isOccupied());

        Tile t1 = new Tile("01");
        t1.occupy();
        assertTrue(t1.isOccupied());
    }
}
