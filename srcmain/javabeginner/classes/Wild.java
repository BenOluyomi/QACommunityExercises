package classes;

public class Wild extends Animal{
	//NEW ATTRIBUTE
	Boolean isDang;
	public Wild(boolean onLand, int legnum, String name, boolean isDang) {
		//INHERITANCE
		super(onLand, legnum, name);
		this.onLand = onLand;
		this.legnum = legnum;
		this.name = name;
		this.isDang= isDang;
	}
	
		//CONSTRUCTOR
		
		//METHODS
		public boolean getDanger() {
			return isDang;
		}
		public void Method(boolean onLand, int legnum, String name, boolean isDang) {
			this.onLand = onLand;
			this.legnum = legnum;
			this.name = name;
			this.isDang = isDang;
		}
		
	}
	
