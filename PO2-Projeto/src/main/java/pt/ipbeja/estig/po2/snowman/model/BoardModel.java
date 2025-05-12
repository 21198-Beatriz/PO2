package pt.ipbeja.estig.po2.snowman.model;

import java.util.ArrayList;
import java.util.List;

public class BoardModel {
    private List<List<TileTerrain>> board;

    public BoardModel(int boardRows, int boardCols, TileTerrain terrainDefault) {
        board = new ArrayList<>();
        for (int y = 0; y < boardRows; y++) {
            List<TileTerrain> row = new ArrayList<>();
            for (int x = 0; x < boardCols; x++) {
                row.add(terrainDefault);
            }
            board.add(row);
        }
    }

    public boolean checkInBounds(int x, int y) {
        if (y >= 0 && y < getBoardCols() && x >= 0 && x < getBoardRows()) {
            return true;
        } else return false;
    }

    public int getBoardRows() {
        return board.size();
    }

    public int getBoardCols() {
        if (!board.isEmpty()) {
            return board.get(0).size();
        } else return 0;
    }

    public TileTerrain getTerrainAtXY(int x, int y) {
        if (checkInBounds(x, y)) {
            return board.get(y).get(x);
        }
        throw new IndexOutOfBoundsException("Espaço a x:" + x + ", y:" + y + " fora de limites.");
    }

    public void setTerrainAtXY(int x, int y, TileTerrain terrain) {
        if (checkInBounds(x, y)) {
            board.get(y).set(x, terrain);
        } else throw new IndexOutOfBoundsException("Espaço a x:" + x + ", y:" + y + " fora de limites.");
    }

    public List<List<TileTerrain>> getBoard() {
        return board;
    }
}
