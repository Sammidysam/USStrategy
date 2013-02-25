package states;

public class NewHampshire extends State {
	public String getName(){
		return "New Hampshire";
	}
	protected int getGDP(){
		return 61600;
	}
	protected float getUnemploymentRate(){
		return 0.057F;
	}
	protected int getSize(){
		return 9304;
	}
	protected int getPopulation(){
		return 1320718;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
