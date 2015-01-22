package states;

import java.awt.Color;
import java.awt.Graphics2D;

import objects.MapTiles;
import main.CreationPanel;

public class CreationState extends State{
	
	private MapTiles maptiles;
	private int tileSize;
	
	public CreationState(StateManager sm){
	
		this.sm = sm;
		
		tileSize = 100;
		
		maptiles = new MapTiles(CreationPanel.WIDTH/tileSize, CreationPanel.HEIGHT/tileSize, tileSize);
		
	}
	
	public void init() {}
	public void update() {}
	public void draw(Graphics2D g) {
		
		g.setBackground(Color.WHITE);
		g.clearRect(0, 0, CreationPanel.WIDTH, CreationPanel.HEIGHT);
		
		maptiles.draw(g);
		
	}
	public void keyPressed(int key) {}
	public void keyReleased(int key) {}
	public void mousePressed(int x, int y, boolean leftclick, boolean rightclick) {
		
		if (leftclick)
			System.out.println("x: " + x + " y:" + y);
		
	}

}
