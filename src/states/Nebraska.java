package states;

public class Nebraska extends State {
	public String getName(){
		return "Nebraska";
	}
	protected int getGDP(){
		return 89600;
	}
	protected float getUnemploymentRate(){
		return 0.037F;
	}
	protected int getSize(){
		return 77354;
	}
	protected int getPopulation(){
		return 1845525;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
