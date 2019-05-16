package com.don.game.level;

import com.don.game.Game;
import com.don.graphics.TextureAtlas;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Level {

    public static final int TILE_SCALE = 8;
    public static final int TILE_IN_GAME_SCALE = 1;
    public static final int TILES_IN_WIDTH = Game.WIDTH / (TILE_SCALE * TILE_IN_GAME_SCALE);
    public static final int TILES_IN_HEIGHT = Game.HEIGHT / (TILE_SCALE * TILE_IN_GAME_SCALE);



    private int[][] tileMap;
    private Map<TileType, Tile> tiles = new HashMap<TileType, Tile>();


    public Level(TextureAtlas atlas){
        tileMap = new int[TILES_IN_WIDTH][TILES_IN_HEIGHT];
        tiles = new HashMap<TileType, Tile>();
        tiles.put(TileType.BRICK, new Tile(atlas.cut(32 * TILE_SCALE,0 * TILE_SCALE,TILE_SCALE,TILE_SCALE),TILE_IN_GAME_SCALE,TileType.BRICK));
        tiles.put(TileType.METAL, new Tile(atlas.cut(32 * TILE_SCALE,2 * TILE_SCALE,TILE_SCALE,TILE_SCALE),TILE_IN_GAME_SCALE,TileType.METAL));
        tiles.put(TileType.WATER, new Tile(atlas.cut(34 * TILE_SCALE,4 * TILE_SCALE,TILE_SCALE,TILE_SCALE),TILE_IN_GAME_SCALE,TileType.WATER));
        tiles.put(TileType.GRASS, new Tile(atlas.cut(32 * TILE_SCALE,4 * TILE_SCALE,TILE_SCALE,TILE_SCALE),TILE_IN_GAME_SCALE,TileType.GRASS));
        tiles.put(TileType.ICE, new Tile(atlas.cut(36 * TILE_SCALE,4 * TILE_SCALE,TILE_SCALE,TILE_SCALE),TILE_IN_GAME_SCALE,TileType.ICE));
        tiles.put(TileType.EMPTY, new Tile(atlas.cut(36 * TILE_SCALE,6 * TILE_SCALE,TILE_SCALE,TILE_SCALE),TILE_IN_GAME_SCALE,TileType.EMPTY));


        tileMap = new int[TILES_IN_WIDTH][TILES_IN_HEIGHT];


    }
    public void update(){

    }
    public void render(Graphics2D g){

    }

}