package objects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Tile extends Polygon{

	private int x, y, textID, tileSize;
	boolean passable;
	
	public Tile(int x, int y, int tileSize){
		
		this.tileSize = tileSize;
		this.textID = 0;
		
		this.x = x;
		this.y = y;
		
		passable = true;
		
		this.addPoint(x, y);
		this.addPoint(x + tileSize, y);
		this.addPoint(x + tileSize, y + tileSize);
		this.addPoint(x, y + tileSize);
		
	}
	
	public void draw(Graphics2D g){
		
		if (!passable) {
			g.setColor(Color.RED);
			g.fillPolygon(this);
		}
		
		g.setColor(Color.BLACK);
		g.drawPolygon(this);
		g.drawString(textID+"", x, y+tileSize/10);
		
	}
	
	public void setPassable(boolean passable){
		this.passable = passable;
	}
	
	public void incrementTextID(){
		textID++;
		if(textID > 9)
			textID = 0;
	}
	
	public void setTextID(int textID){
		this.textID = textID;
	}
	
	public boolean getPassable(){
		return passable;
	}
	
	public int setTextID(){
		return textID;
	}
	
	
	
}
