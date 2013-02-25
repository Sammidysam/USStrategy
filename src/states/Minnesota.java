package states;

public class Minnesota extends State {
	public String getName(){
		return "Minnesota";
	}
	protected int getGDP(){
		return 267100;
	}
	protected float getUnemploymentRate(){
		return 0.055F;
	}
	protected int getSize(){
		return 86939;
	}
	protected int getPopulation(){
		return 5379139;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
