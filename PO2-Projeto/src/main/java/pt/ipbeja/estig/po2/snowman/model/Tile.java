package pt.ipbeja.estig.po2.snowman.model;

public class Tile {
    private TileTerrain terrain;

    public Tile(TileTerrain terrain) {
        this.terrain = terrain;
    }

    public TileTerrain getTerrain() {
        return terrain;
    }

    public void setTerrain(TileTerrain terrain) {
        this.terrain = terrain;
    }


}
