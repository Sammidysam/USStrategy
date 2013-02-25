package states;

public class SouthDakota extends State {
	public String getName(){
		return "South Dakota";
	}
	protected int getGDP(){
		return 39900;
	}
	protected float getUnemploymentRate(){
		return 0.044F;
	}
	protected int getSize(){
		return 77116;
	}
	protected int getPopulation(){
		return 833354;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
