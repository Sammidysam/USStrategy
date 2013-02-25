package states;

public class Florida extends State {
	public String getName(){
		return "Florida";
	}
	protected int getGDP(){
		return 754000;
	}
	protected float getUnemploymentRate(){
		return 0.08F;
	}
	protected int getSize(){
		return 65755;
	}
	protected int getPopulation(){
		return 19317568;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
