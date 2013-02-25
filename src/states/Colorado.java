package states;

public class Colorado extends State {
	public String getName(){
		return "Colorado";
	}
	protected int getGDP(){
		return 259700;
	}
	protected float getUnemploymentRate(){
		return 0.076F;
	}
	protected int getSize(){
		return 104094;
	}
	protected int getPopulation(){
		return 5187582;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
