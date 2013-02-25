package states;

public class Pennsylvania extends State {
	public String getName(){
		return "Pennsylvania";
	}
	protected int getGDP(){
		return 575600;
	}
	protected float getUnemploymentRate(){
		return 0.079F;
	}
	protected int getSize(){
		return 46055;
	}
	protected int getPopulation(){
		return 12763536;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
