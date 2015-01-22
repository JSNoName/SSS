package states;

import java.awt.Graphics2D;

import main.CreationPanel;

public abstract class State {

	protected StateManager sm;
	protected int stringx, stringy;
	
	public abstract void init();
	public abstract void update();
	public abstract void draw(Graphics2D g);
	public abstract void mousePressed(int x, int y);
	public abstract void keyPressed(int key);
	public abstract void keyReleased(int key);
	public void drawStringToCenter(String s, Graphics2D g){
		int stringLength = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();
		int stringOrigin = CreationPanel.WIDTH/2 - stringLength/2;
		g.drawString(s, stringOrigin, CreationPanel.HEIGHT/2);
	}
	public void drawStringToCenter(String s, int height, Graphics2D g){
		int stringLength = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();
		int stringOrigin = CreationPanel.WIDTH/2 - stringLength/2;
		g.drawString(s, stringOrigin, height);
	}

	
}
