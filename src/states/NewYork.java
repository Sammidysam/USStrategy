package states;

public class NewYork extends State {
	public String getName(){
		return "New York";
	}
	protected int getGDP(){
		return 1156500;
	}
	protected float getUnemploymentRate(){
		return 0.082F;
	}
	protected int getSize(){
		return 54556;
	}
	protected int getPopulation(){
		return 19570261;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
