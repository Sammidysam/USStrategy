package states;

public class NewMexico extends State {
	public String getName(){
		return "New Mexico";
	}
	protected int getGDP(){
		return 75500;
	}
	protected float getUnemploymentRate(){
		return 0.064F;
	}
	protected int getSize(){
		return 121589;
	}
	protected int getPopulation(){
		return 2085538;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
