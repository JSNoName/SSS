package game;

public class Weapon {
	private String name;
	private int damage;
	private int range;
	private int upgradelevel;
	
	
	public Weapon(){
		this.name 			= "unnamed Weapon";
		this.damage 		= 0;
		this.range			= 0;
		this.upgradelevel 	= 0;
	}
	
	
	public Weapon(String n, int d, int r, int ul){
		this.name 			= n;
		this.damage 		= d;
		this.range			= r;
		this.upgradelevel 	= ul;
	}
	
	
	/*
	 * Fire function
	 * Using a function to fire the weapon lets us have different
	 * firing patterns.
	 * We will just override this function when we make a weapon
	 */
	
	public void fire(){
		//shoot the bad guys
	}
	
	//we might not use alt fire, but I'll put this here just in case
	public void altfire(){
		//shoot the bad guys in a special way
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


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}


	public int getUpgradelevel() {
		return upgradelevel;
	}


	public void setUpgradelevel(int upgradelevel) {
		this.upgradelevel = upgradelevel;
	}
	
	
	

}
