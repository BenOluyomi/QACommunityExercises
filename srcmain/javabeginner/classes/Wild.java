package classes;

public class Wild extends Dog{
	//NEW ATTRIBUTE
	Boolean isDang;
	public Wild(boolean onLand, int legnum, String name, String noise,boolean isDang) {
		//INHERITANCE
		super(onLand, legnum, name,noise);
		this.onLand = onLand;
		this.legnum = legnum;
		this.name = name;
		this.noise = noise;
		this.isDang= isDang;
	}
	
		//CONSTRUCTOR
		
		//METHODS
		public boolean getDanger() {
			return isDang;
		}
		public void Method(boolean onLand, int legnum, String name, String noise, boolean isDang) {
			this.onLand = onLand;
			this.legnum = legnum;
			this.name = name;
			this.noise = noise;
			this.isDang = isDang;
		}
		
	}
	
