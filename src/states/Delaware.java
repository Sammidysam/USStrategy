package states;

public class Delaware extends State {
	public String getName(){
		return "Delaware";
	}
	protected int getGDP(){
		return 62700;
	}
	protected float getUnemploymentRate(){
		return 0.069F;
	}
	protected int getSize(){
		return 2940;
	}
	protected int getPopulation(){
		return 917092;
	}
	protected boolean doesBorderForeignCountry(){
		return false;
	}
}
