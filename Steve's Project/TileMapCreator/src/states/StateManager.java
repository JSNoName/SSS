package states;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class StateManager {

	private ArrayList<State> states;
	private int currentState;
	
	public static final int CREATIONSTATE = 0;
	//future states here
	
	public StateManager(){
		
		states = new ArrayList<State>();
		
		currentState = CREATIONSTATE;
		states.add(new CreationState(this));
		//add future states
		
	}
	
	public void setState(int state){		
		currentState = state;
		states.get(currentState).init();
	}
	
	public void init(){ states.get(currentState).init(); }
	public void update(){ states.get(currentState).update(); }	
	public void draw(Graphics2D g){	states.get(currentState).draw(g); }
	public void mousePressed(int x, int y, boolean leftclick, boolean rightclick){ states.get(currentState).mousePressed(x, y, leftclick, rightclick); }
	
}