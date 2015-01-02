package game;


/*
 * We'll probably have both the playable character and enemies inherit from this class
 * since both are really similar.
 */
public class Character {

	private String name;
	private int hp;
	private int speed;
	private int jumpheight;
	private String imagepath;
	
	
	
	/*
	 * Probably have some booleans to determine which abilities are unlocked
	 */
	
	private boolean doublejump;
	
	public Character(){
		//Generic constructor with default values
		this.name 			= "notset";
		this.hp 			= 0;
		this.speed 			= 0;
		this.jumpheight	 	= 0;
		this.doublejump 	= false;
	}
	public Character(String n, int h, int s, int jh){
		//initialize our variables
		this.name 			= n;
		this.hp 			= h;
		this.speed 			= s;
		this.jumpheight 	= jh;
		this.doublejump 	= false;
	}


	/*
	 * Special abilities will probably be implemented as functions
	 * I.E. doubledump will call doublejump(); 
	 * This might be useful once abilities are more complicated
	 * IF they get more complicated.
	 */
	
	public void doublejump(){
		//jump a second time.
	}
	
	
	
	
	
	
	
	/*
	 * ################################################################################
	 * 
	 * Getters and Setters
	 * 
	 * ################################################################################
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getJumpheight() {
		return jumpheight;
	}
	public void setJumpheight(int jumpheight) {
		this.jumpheight = jumpheight;
	}
	public boolean isDoublejump() {
		return doublejump;
	}
	public void setDoublejump(boolean doublejump) {
		this.doublejump = doublejump;
	}
	public String getImagePath(){
		return this.imagepath;
	}
	public void setImagePath(String ip){
		this.imagepath = ip;
	}
}
