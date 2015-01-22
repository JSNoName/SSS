package objects;

import java.awt.Graphics2D;

public class MapTiles {
	
	private Tile[][] tiles;
	private int width, height, tileSize;
	
	public MapTiles(int width, int height, int tileSize){
		
		this.width = width;
		this.height = height;
		
		tiles = new Tile[width][height];
		
		for (int i = 0; i < width; i++)			
			for (int j = 0; j < height; j++)				
				tiles[i][j] = new Tile(i*tileSize, j*tileSize, tileSize);		
		
	}
	
	public void draw(Graphics2D g){
		
		for (int i = 0; i < width; i++)			
			for (int j = 0; j < height; j++)				
				tiles[i][j].draw(g);	
		
	}

}
