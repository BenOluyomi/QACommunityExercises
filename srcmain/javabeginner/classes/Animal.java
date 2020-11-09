package classes;

public class Animal {
	// ATTRIBUTES
	protected boolean onLand;
	protected int legnum;
	protected String name;
	
	// CONSTRUCTORS
	public Animal(boolean onLand, int legnum, String name) {
		this.onLand = onLand;
		this.legnum = legnum;
		this.name = name;
	}
	
	// METHODS
	public boolean getPlace() {
		return onLand;
	}
	
	public int getLeg() {
		return legnum;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void myMethod(boolean onLand, int legnum, String name) {
		
	}
	
}


