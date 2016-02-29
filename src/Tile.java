public class Tile {
    private final String id;
    private boolean isOccupied;

    public Tile(String tileId) {
        this.id = tileId;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public String getId() {
        return id;
    }

    public void occupy() {
        isOccupied = true;
    }
}
