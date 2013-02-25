package states;

public class SouthCarolina extends State {
	public String getName(){
		return "South Carolina";
	}
	protected int getGDP(){
		return 164300;
	}
	protected float getUnemploymentRate(){
		return 0.084F;
	}
	protected int getSize(){
		return 32020;
	}
	protected int getPopulation(){
		return 4723723;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
