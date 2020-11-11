package classes;

public class Dog extends Animal{
	//NEW ATTRIBUTE
	String noise;
	public Dog(boolean onLand, int legnum, String name, String noise) {
		//INHERITANCE
		super(onLand, legnum, name);
		this.onLand = onLand;
		this.legnum = legnum;
		this.name = name;
		this.noise = noise;
	}
	
		//CONSTRUCTOR
		
		//METHODS
		public String getNoise() {
			return noise;
		}
		public void Method(boolean onLand, int legnum, String name, String noise) {
			this.onLand = onLand;
			this.legnum = legnum;
			this.name = name;
			this.noise = noise;
		}
		
	}
	

