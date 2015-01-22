package objects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Tile extends Polygon{

	private int x, y, textID, tileSize;
	boolean passable;
	
	public Tile(int x, int y, int tileSize){
		
		this.tileSize = tileSize;
		
		this.x = x;
		this.y = y;
		
		passable = true;
		
		this.addPoint(x, y);
		this.addPoint(x + tileSize, y);
		this.addPoint(x + tileSize, y + tileSize);
		this.addPoint(x, y + tileSize);
		
	}
	
	public void draw(Graphics2D g){
		
		g.setColor(Color.BLACK);
		g.drawPolygon(this);
		g.drawString(textID+"", x, y);
		
	}
	
	public void setPassable(boolean passable){
		this.passable = passable;
	}
	
	
	
}
