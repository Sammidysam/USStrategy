package states;

public class Washington extends State {
	public String getName(){
		return "Washington";
	}
	protected int getGDP(){
		return 351100;
	}
	protected float getUnemploymentRate(){
		return 0.076F;
	}
	protected int getSize(){
		return 71300;
	}
	protected int getPopulation(){
		return 6897012;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
