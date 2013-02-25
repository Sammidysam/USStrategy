package states;

public class Vermont extends State {
	public String getName(){
		return "Vermont";
	}
	protected int getGDP(){
		return 26400;
	}
	protected float getUnemploymentRate(){
		return 0.051F;
	}
	protected int getSize(){
		return 9620;
	}
	protected int getPopulation(){
		return 626011;
	}
	protected boolean doesBorderForeignCountry(){
		return true;
	}
}
