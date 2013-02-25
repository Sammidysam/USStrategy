package states;

public class NewJersey extends State {
	public String getName(){
		return "New Jersey";
	}
	protected int getGDP(){
		return 497000;
	}
	protected float getUnemploymentRate(){
		return 0.096F;
	}
	protected int getSize(){
		return 8721;
	}
	protected int getPopulation(){
		return 8864590;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
